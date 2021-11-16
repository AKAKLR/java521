package operation;

import book.BookList;

public class FindOperation implements IoOperation{
    public void work(BookList bookList){
        System.out.println("查找操作");
    }
}
