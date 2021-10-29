import java.util.Scanner;

public class JAVADOME {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A= scanner.next();
String password="123456";
            int retrytime=3;
            for (int i = 0; i < 3; i++) {
                String input = scanner.nextLine();
                if (input.equals(password)) {
                    System.out.println("输入正确！");
                    break;
                }
                else {
                    retrytime--;
                    System.out.println("输入错误，请重新输入,还有" + retrytime + "次机会");
                }
            }
            //输入错误三次
            if (retrytime == 0) {
                System.out.println("输入次数用完，退出程序");
            }
        }

    }




