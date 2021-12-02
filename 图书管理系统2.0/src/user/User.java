package user;

import Book.BookLIST;
import operation.IOoperation;

public abstract class User {
    protected String name;
    protected IOoperation[] iOoperations;
    public User(String name){
        this.name=name;
    }
    public abstract int menu() ;
    public void  doWork(int choice, BookLIST bookLIST){
        iOoperations[choice].work(bookLIST);
    }
}
