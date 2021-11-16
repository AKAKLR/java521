package user;

import book.BookList;
import operation.*;
import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name){
    super(name);
        this.ioOperations=new IoOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
        new ReturnOperation(),
        new DisplayOperation()
    };


    }
    public int menu(){
        System.out.println("==========管理员菜单============");
        System.out.println("hello"+this.name+"欢迎来到这里");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("===============================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void doWork(int choice, BookList bookList) {

    }

}
