package common;

import java.io.*;

public class FileUtil {
    // 负责把 filePath 对应的文件的内容读取出来, 放到返回值中.
    public static String readFile(String filePath) {
        StringBuilder result = new StringBuilder();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (true) {
                int ch = fileReader.read();
                if (ch == -1) {
                    break;
                }
                result.append((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    // 负责把 content 写入到 filePath 对应的文件中
    public static void writeFile(String filePath, String content) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileUtil.writeFile("d:/test.txt", "hello");
        String content = FileUtil.readFile("d:/test.txt");
        System.out.println(content);
    }
}

