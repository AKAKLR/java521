package book;

public class BookList {
    private Book[]books=new Book[10];
    private int usedSize;
    public BookList(){
        books[0]=new Book("三国演义","罗贯中",17,"小说");
        books[1]=new Book("西游记","吴承恩",19,"小说");
        books[2]=new Book("水浒传","罗贯中",19,"小说");
        this.usedSize=3;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
//pos 下标放一本书book；
    public void setBook(int pos,Book book){
        this.books[pos]=book;
    }
}
