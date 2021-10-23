import java.util.Scanner;

public class javadome {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        while(a%10!=0){
            System.out.println(a%10);
            a=a/10;
        }
    }
}
