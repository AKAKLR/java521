import java.util.Scanner;

public class javademo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 2;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("不是素数");
                break;
            }else{
                System.out.println("是素数");
                break;
            }


        }

    }
}