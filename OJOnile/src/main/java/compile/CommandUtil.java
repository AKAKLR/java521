package compile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CommandUtil {
    // 1. 通过 Runtime 类得到 Runtime 实例, 执行 exec 方法
    // 2. 获取到标准输出, 并写入到指定文件中.
    // 3. 获取到标准错误, 并写入到指定文件中.
    // 4. 等待子进程结束, 拿到子进程的状态码, 并返回.
    public static int run(String cmd, String stdoutFile, String stderrFile) {
        try {
            // 1. 通过 Runtime 类得到 Runtime 实例, 执行 exec 方法
            Process process = Runtime.getRuntime().exec(cmd);
            // 2. 获取到标准输出, 并写入到指定文件中.
            if (stdoutFile != null) {
                InputStream stdoutFrom = process.getInputStream();
                FileOutputStream stdoutTo = new FileOutputStream(stdoutFile);
                while (true) {
                    int ch = stdoutFrom.read();
                    if (ch == -1) {
                        break;
                    }
                    stdoutTo.write(ch);
                }
                stdoutFrom.close();
                stdoutTo.close();
            }
            // 3. 获取到标准错误, 并写入到指定文件中.
            if (stderrFile != null) {
                InputStream stderrFrom = process.getErrorStream();
                FileOutputStream stderrTo = new FileOutputStream(stderrFile);
                while (true) {
                    int ch = stderrFrom.read();
                    if (ch == -1) {
                        break;
                    }
                    stderrTo.write(ch);
                }
                stderrFrom.close();
                stderrTo.close();
            }
            // 4. 等待子进程结束, 拿到子进程的状态码, 并返回.
            int exitCode = process.waitFor();
            return exitCode;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public static void main(String[] args) {
        CommandUtil.run("javac", "stdout.txt", "stderr.txt");
    }
}
