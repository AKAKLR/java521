package operation;

import Book.BookLIST;

public class ExitOperation implements IOoperation{
    public void work(BookLIST bookLIST){
        System.out.println("退出系统");
    }
}
