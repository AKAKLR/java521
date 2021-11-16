import book.BookList;
import operation.BorrowOperation;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login() {
        System.out.println("请输入姓名");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入0或者1，1代表管理人员，0代表借书的用户");
        int choice=scanner.nextInt();
        if(choice==1){
            return  new AdminUser(name);
        }else {
            return  new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user =login();
        while (true) {
            int choice = user.menu();
            user.doWork(choice, bookList);
        }
    }
}

