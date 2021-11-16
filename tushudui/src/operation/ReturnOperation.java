package operation;

import book.BookList;

public class ReturnOperation implements IoOperation{
    public void work(BookList bookList){
        System.out.println("退出");
    }
}
