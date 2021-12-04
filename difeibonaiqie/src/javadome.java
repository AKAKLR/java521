import java.util.Scanner;

public class javadome {
    public static int feibo(int a) {
        int b=0;
        if(a==1||a==2){
            return 1;
        }else if(a>=3){
             b= feibo(a-1)+feibo(a-2);
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println(feibo(a));
    }
}
