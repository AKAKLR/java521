package operation;

import java.util.Scanner;

public class AddOperation implements IOperation{

    public void work(BookList bookList) {
        System.out.println("新增图书！");
        System.out.println("请输入图书的名字");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("请输入图书的作者");
        String auther= scanner.nextLine();
        System.out.println("请输入图书的价钱");
        int price=scanner.nextInt();
        System.out.println("请输入图书的类型");
    }

}

