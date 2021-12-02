package operation;

import Book.BookLIST;

import java.awt.print.Book;
import java.util.Scanner;

public class AddOperation implements IOoperation{
    public void work(BookLIST bookLIST){
        System.out.println("添加图书");
        System.out.println("新增图书");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入图书名称：");
        String name = sc.nextLine();
        System.out.println("请输入图书的作者：");
        String author = sc.nextLine();
        System.out.println("请输入图书的类型：");
        String type = sc.nextLine();
        System.out.println("请输入图书的价格：");
        int price = sc.nextInt();
        // 得到了 书的属性，就可以new Book 传参了
        Book book = new Book(name,author,price,type);

        // 得到目前书的数量，数组你知道的，下标从0开始，最后一本的的下标是usedSize-1.
        // 那么我们只需 下标 为usedSize，增加就可以了
        int size = bookLIST.getUsedSize();
        bookLIST.setBook(size,book);

        // 添加完一本书，书的数量加一
        bookLIST.setUsedSize(size+1);

        System.out.println("添加成功");

    }

    }

