import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        // 通过这个简单的程序, 把一个文件的内容读取出来, 写入到另一个文件中. (相当于文件拷贝功能)
        String srcPath = "d:\\test1.txt";
        String destPath = "d:\\test2.txt";

        // 读写文件之前, 一定要先打开!
        // 通过这个代码打开了第一个用来读数据的文件
        FileInputStream fileInputStream = new FileInputStream(srcPath);
        // 通过这个代码打开了第二个用来写数据的文件
        FileOutputStream fileOutputStream = new FileOutputStream(destPath);

        // 循环的把第一个文件的内容按照字节来读取出来, 依次写入到第二个文件中
        while (true) {
            // read 方法依次返回的是一个字节 (byte), 但是实际上确是使用 int 来进行接收的!!
            // 这样做的理由主要是两个方面:
            // 1. Java 中不存在无符号类型. byte 这样的类型也是有符号的(有正负). byte 的表示范围 -128 => +127
            //    实际上在按照字节读取数据的时候, 并不需要让这样的数据进行算术运算. 此时, 这里的正负就没有意义了.
            //    因此期望读到的结果是一个 "无符号的数字" , 0 => 255
            // 2. read 如果读取完毕(文件读到末尾了), 就会返回 EOF (end of file). 用 -1 来表示.
            int ch = fileInputStream.read();
            if (ch == -1) {
                // 文件读取完了
                break;
            }
            fileOutputStream.write(ch);
        }

        // 文件操作完毕之后, 不要忘了关闭文件!
        // 如果忘记关闭, 可能会引起 "文件资源泄露"
        fileInputStream.close();
        fileOutputStream.close();
    }
}

