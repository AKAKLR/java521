import java.util.Scanner;

public class javadome {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i == j) {
                    System.out.println("该数是素数");
                }
            }
        }
    }
