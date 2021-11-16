package user;

import book.BookList;
import operation.IoOperation;
public abstract class User {
    protected String name;
    protected IoOperation[]ioOperations;
public User(String name){
    this.name=name;
}
    public int menu() {

        return 0;
    }
    public abstract void doWork(int choice, BookList bookList);
}
