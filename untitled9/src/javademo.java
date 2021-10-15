import java.util.Random;
import java.util.Scanner;

public class javademo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        Random rand=new Random();
        int b=rand.nextInt(100);
        while(true) {
            if (a > b) {
                System.out.println("a>b");

            }
            else if (a == b) {
                System.out.println("a=b");
                break;
            }
            else {
                System.out.println("a<b");

            }
        }
        System.out.println("游戏jieshu'");
    }
}
