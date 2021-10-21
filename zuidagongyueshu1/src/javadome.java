import java.util.Scanner;

public class javadome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c=a%b;
        if(c!=0){
            a=b;
            b=c;
            c=(a%b);
        }
        System.out.println(b);
    }
}
