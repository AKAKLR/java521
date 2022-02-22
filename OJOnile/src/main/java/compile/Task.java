package compile;

import common.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// 每次的 "编译+运行" 这个过程, 就称为是一个 compile.Task
public class Task {
    // 通过一组常量来约定临时文件的名字.
    // 之前这里的名字都是静态常量. 但是现在要实现针对每个请求都有不同的临时目录, 就不能使用静态常量了
    // 这个表示所有临时文件所在的目录
    private String WORK_DIR = null;
    // 约定代码的类名
    private String CLASS = null;
    // 约定要编译的代码文件名.
    private String CODE = null;
    // 约定存放编译错误信息的文件名
    private String COMPILE_ERROR = null;
    // 约定存放运行时的标准输出的文件名
    private String STDOUT = null;
    // 约定存放运行时的标准错误的文件名
    private String STDERR = null;

    public Task() {
        // 在 Java 中使用 UUID 这个类就能生成一个 UUID 了
        WORK_DIR = "./tmp/" + UUID.randomUUID().toString() + "/";
        CLASS = "Solution";
        CODE = WORK_DIR + "Solution.java";
        COMPILE_ERROR = WORK_DIR + "compileError.txt";
        STDOUT = WORK_DIR + "stdout.txt";
        STDERR = WORK_DIR + "stderr.txt";
    }

    // 这个 compile.Task 类提供的核心方法, 就叫做 compileAndRun, 编译+运行 的意思.
    // 参数: 要编译运行的 java 源代码.
    // 返回值: 表示编译运行的结果. 编译出错/运行出错/运行正确.....
    public Answer compileAndRun(Question question) {
        Answer answer = new Answer();
        // 0. 准备好用来存放临时文件的目录
        File workDir = new File(WORK_DIR);
        if (!workDir.exists()) {
            // 创建多级目录.
            workDir.mkdirs();
        }
        // 进行安全性判定
        if (!checkCodeSafe(question.getCode())) {
            System.out.println("用户提交了不安全的代码!");
            answer.setError(3);
            answer.setReason("您提交的代码可能会危害到服务器, 禁止运行!");
            return answer;
        }
        // 1. 把 question 中的 code 写入到一个 Solution.java 文件中.
        FileUtil.writeFile(CODE, question.getCode());
        // 2. 创建子进程, 调用 javac 进行编译. 注意! 编译的时候, 需要有一个 .java 文件.
        //       如果编译出错, javac 就会把错误信息给写入到 stderr 里. 就可以用一个专门的文件来保存. compileError.txt
        //    需要先把编译命令给构造出来.
        String compileCmd = String.format("javac -encoding utf8 %s -d %s", CODE, WORK_DIR);
        System.out.println("编译命令: " + compileCmd);
        CommandUtil.run(compileCmd, null, COMPILE_ERROR);
        // 如果编译出错了, 错误信息就被记录到 COMPILE_ERROR 这个文件中了. 如果没有编译出错, 这个文件是空文件.
        String compileError = FileUtil.readFile(COMPILE_ERROR);
        if (!compileError.equals("")) {
            // 编译出错!
            // 直接返回 compile.Answer, 让 compile.Answer 里面记录编译的错误信息.
            System.out.println("编译出错!");
            answer.setError(1);
            answer.setReason(compileError);
            return answer;
        }
        // 编译正确! 继续往下执行运行的逻辑
        // 3. 创建子进程, 调用 java 命令并执行
        //       运行程序的时候, 也会把 java 子进程的标准输出和标准错误获取到. stdout.txt, stderr.txt
        String runCmd = String.format("java -classpath %s %s", WORK_DIR, CLASS);
        System.out.println("运行命令: " + runCmd);
        CommandUtil.run(runCmd, STDOUT, STDERR);
        String runError = FileUtil.readFile(STDERR);
        if (!runError.equals("")) {
            System.out.println("运行出错!");
            answer.setError(2);
            answer.setReason(runError);
            return answer;
        }
        // 4. 父进程获取到刚才的编译执行的结果, 并打包成 compile.Answer 对象
        //       编译执行的结果, 就通过刚才约定的这几个文件来进行获取即可.
        answer.setError(0);
        answer.setStdout(FileUtil.readFile(STDOUT));
        return answer;
    }

    private boolean checkCodeSafe(String code) {
        List<String> blackList = new ArrayList<>();
        // 防止提交的代码运行恶意程序
        blackList.add("Runtime");
        blackList.add("exec");
        // 禁止提交的代码读写文件
        blackList.add("java.io");
        // 禁止提交的代码访问网络
        blackList.add("java.net");

        for (String target : blackList) {
            int pos = code.indexOf(target);
            if (pos >= 0) {
                // 找到任意的恶意代码特征, 返回 false 表示不安全
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Task task = new Task();
        Question question = new Question();
        question.setCode("public class Solution {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"hello world\");\n" +
                "    }\n" +
                "}\n");
        Answer answer = task.compileAndRun(question);
        System.out.println(answer);
    }
}