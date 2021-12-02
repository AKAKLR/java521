import Book.BookLIST;
import operation.IOoperation;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("请输入你的身份:1.管理员    0.普通");
        int choice=scanner.nextInt();
        if(choice==1){
            return new AdminUser(name);
        }else {
           return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookLIST bookLIST=new BookLIST();
        User user=login();
       while (true){
         int choice=user.menu();
         user.doWork(choice,bookLIST);
    }
}}
