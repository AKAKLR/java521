import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestExec {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Runtime 在 JVM 中是一个单例
        Runtime runtime = Runtime.getRuntime();
        // Process 就表示 "进程"
        Process process = runtime.exec("javac");
        // 获取到子进程的标准输出和标准错误, 把这里的内容写入到两个文件中.
        // 获取标准输出, 从这个文件对象中读, 就能把子进程的标准输出给读出来!
        InputStream stdoutFrom = process.getInputStream();
        FileOutputStream stdoutTo = new FileOutputStream("stdout.txt");
        while (true) {
            int ch = stdoutFrom.read();
            if (ch == -1) {
                break;
            }
            stdoutTo.write(ch);
        }
        stdoutFrom.close();
        stdoutTo.close();

        // 获取标准错误, 从这个文件对象中读, 就能把子进程的标准错误给读出来!
        InputStream stderrFrom = process.getErrorStream();
        FileOutputStream stderrTo = new FileOutputStream("stderr.txt");
        while (true) {
            int ch = stderrFrom.read();
            if (ch == -1) {
                break;
            }
            stderrTo.write(ch);
        }
        stderrFrom.close();
        stderrTo.close();

        // 通过 Process 类的 waitFor 方法来实现进程的等待.
        // 父进程执行到 waitFor 的时候, 就会阻塞. 一直阻塞到子进程执行完毕为止.
        // (和 Thread.join 是非常类似的)
        // 这个退出码 就表示子进程的执行结果是否 ok. 如果子进程是代码执行完了正常退出, 此时返回的退出码就是 0.
        // 如果子进程代码执行了一半异常退出(抛异常), 此时返回的退出码就非 0.
        int exitCode = process.waitFor();
        System.out.println(exitCode);
    }
}
