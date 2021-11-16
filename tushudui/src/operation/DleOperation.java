package operation;

import book.BookList;

public class DleOperation implements IoOperation{
    public  void work(BookList bookList){
        System.out.println("删除图书");
    }
}
