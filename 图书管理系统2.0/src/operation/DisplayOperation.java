package operation;

import Book.BookLIST;
import Book.book;

public class DisplayOperation implements IOoperation{
    public void work(BookLIST bookLIST){
        System.out.println("打印图书");
        for (int i = 0; i < bookLIST.getUsedSize(); i++) {
            book book = bookLIST.getPos(i);// 换取书的信息
            System.out.println(book);
        }

    }
}
