import java.util.Scanner;

public class testdome {
    public static user login() {
        System.out.println("请输入一个名字");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("如果是管理员扣1，不是管理员扣0");
        int isop= scanner.nextInt();
        if(isop==1){
            return new op(name);
        } else {
            return new p(name);
        }
        }

    }
}
