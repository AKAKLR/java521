package book;

public class Book {
    private String name;
    private String anther;
    private int price;
    private String type;
    private boolean isBorrowed;
    public Book(String name,String anther,int price,String type,boolean isBorrowed){
        this.name=name;
        this.anther=anther;
        this.price=price;
        this.type=type;
        this.isBorrowed=isBorrowed;
    }

    public Book(String name, String anther, int price, String type) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnther() {
        return anther;
    }

    public void setAnther(String anther) {
        this.anther = anther;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", anther='" + anther + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
