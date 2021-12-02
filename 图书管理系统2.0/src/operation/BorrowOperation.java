package operation;

import Book.BookLIST;

public class BorrowOperation implements IOoperation {
    public void work(BookLIST bookLIST){
        System.out.println("借阅图书");
    }
}
