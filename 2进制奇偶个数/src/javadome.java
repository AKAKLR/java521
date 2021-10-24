import java.util.Scanner;

public class javadome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("偶数序列");
        for(int i=31;i>0;i-=2){
            System.out.print((a>>i)&1);
        }
        System.out.println(" ");
        System.out.println("奇数序列");
        for(int i=30;i>-2;i-=2) {
            System.out.print((a >> i) & 1);
        }
    }
}
