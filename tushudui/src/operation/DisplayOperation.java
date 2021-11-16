package operation;

import book.BookList;

public class DisplayOperation implements IoOperation{
    public void  work(BookList bookList){
        System.out.println("展示图书");
    }
}
