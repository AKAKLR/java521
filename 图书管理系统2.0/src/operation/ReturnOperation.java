package operation;

import Book.BookLIST;

public class ReturnOperation implements IOoperation{
    public void work(BookLIST bookLIST){
        System.out.println("归还图书");
    }
}
