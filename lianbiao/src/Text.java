public class Text {
    public static void main(String[] args) {
        Mylist mylist=new Mylist();
        mylist.creatlist();
        mylist.display();
     boolean set= mylist.contains(3);
        System.out.println(set);
        System.out.println(mylist.num());
    }
}
