import java.util.*;
public class javademo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        if(num<18)
        System.out.println("少年");
        if(19 < num||num < 28)
            System.out.println("青年");
        if(num>29)
            System.out.println("laonian");
    }
}
