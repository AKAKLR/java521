import java.util.Scanner;

public class javadome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            System.out.println();
            String password = scanner.nextLine();

            if (password.equals("123456")) {
                System.out.println("登陆成功");
                break;

            }else{
                count--;
                System.out.println("你输错密码了");

            }
        }
    }
}