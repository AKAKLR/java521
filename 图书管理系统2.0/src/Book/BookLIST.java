package Book;

import java.awt.print.Book;

public class BookLIST {
        private book[] books = new book[10];//初始书架空间为10本书
        private int usedSize;// 默认初始存储为 0

        // 假设默认存放四本书,通过调用构造方法来实现，
        public BookLIST(){
            books[0] = new book("三国演义","罗贯中",40,"小说");
            books[1] = new book("西游记","吴承恩",45,"小说");
            books[2] = new book("水浒传","施耐庵",47,"小说");
            books[3] = new book("红楼梦","曹雪芹",50,"小说");
            this.usedSize = 3;
        }
        // 获取当前书架上有几本书
        public int getUsedSize() {
            return usedSize;
        }
        // 在增删的时候，需要用到
        public void setUsedSize(int usedSize) {
            this.usedSize = usedSize;
        }

        // 一般图书馆的书，都是有编号的，假设书的编号 为 我们元素的下标
        // 输入编号，返回书籍信息
        public book getPos(int pos){
            //考虑pos位置的合法性
            if (pos<0&&pos>usedSize){
                System.out.println("没有书籍的编号符合你的需求。");
                return null;
            }
            return  this.books[pos];
        }
        public void setBooks(int pos,Book book){

        }

}


