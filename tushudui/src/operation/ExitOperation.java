package operation;

import book.BookList;

public class ExitOperation implements IoOperation {
    public void work(BookList bookList){
        System.out.println("退出操作");
    }
}
