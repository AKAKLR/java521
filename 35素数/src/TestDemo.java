import java.util.Scanner;
import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num <= 100) {
            if (num % 15 == 0) {
                System.out.println(num);

            }
            System.out.println("hhhhhh");
            num++;
        }
    }
}