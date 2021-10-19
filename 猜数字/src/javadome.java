import java.util.Random;
import java.util.Scanner;

public class javadome {
    public static void main(String[] args) {
        Random random=new Random();
        int rand= random.nextInt(100)+1;
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("请输入一个数字");
            int a= scanner.nextInt();
            if(a<rand){
                System.out.println("猜小了");

            }else if (a>rand){
                System.out.println("猜大了");

            }else{
                System.out.println("猜对了");
                break;
            }


        }
    }

}
