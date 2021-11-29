import java.nio.charset.StandardCharsets;
import java.util.Arrays;
//对于继承的理解，理解成是否是同一种类型。
public class Testdome {
    //比较两个字符串是否相等
    public static void main(String[] args) {
        String str1="adafs";
        String str2="Adafs";
        System.out.println(str1.equals(str2));
        String str3=str1;
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
    //字节数组改成字符传
    //字符串变成字节数组
    public static void main1(String[] args) {
        byte[] bytes={97,98,99,100};
        String str=new String(bytes,1,3);
        System.out.println(str);
        System.out.println("=========");
        String str2="bit";
        byte[]bytes1=str2.getBytes();
        System.out.println(Arrays.toString(bytes1));
    }

}
