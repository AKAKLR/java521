import java.util.Scanner;

public class javadome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int count=0;
        while(a!=0){
            if((a&1)!=0){
             count++;
             a=a>>1;
            }
        }
        System.out.println(count);
    }

}
