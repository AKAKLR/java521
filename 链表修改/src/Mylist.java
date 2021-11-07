import java.util.Random;

class List{
   public int val;
   public List next;
   public List (int val){
       this.val=val;
   }
        }
public class Mylist {
    public List head;//链表的头
    public void creat(){
        List list1=new List(1);
        List list2=new List(2);
        List list3=new List(3);
        List list4=new List(4);
        List list5=new List(5);
        list1.next=list2;
        list2.next=list3;
        list3.next=list4;
        list4.next=list5;
        this.head=list1;
    }
    public  void display(){
        List cur=head;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
}
        System.out.println();
    }
    public boolean coutains(int key){
        List cur=head;
        boolean cout;
        while (cur!=null){
            if(cur.val==key){
                return cout=true;
            }else {
                cur=cur.next;
            }
        }
        return false;
    }
public void first(int date){
        List node=new List(date);
        node.next=head;//让node指向head
        head=node;//让node为首，
}
public void last(int date){
        List node=new List(date);
        if(this.head==null) {
            head.next=node;
        }
         List cur = head;
        while (cur.next!=null){
            cur=cur.next;
        }
    cur.next=node;
}
public List findindax(int xia) {
    List cur = head;
    while (xia - 1 != 0) {
        cur = cur.next;
        xia--;
    }
    return cur;
}
public  void  indax(int xia,int date){
        List node=new  List(date);
        List cur=head;
        if(xia==0) {
        first(date);
        }
        findindax(xia);
        node.next=cur.next;
        cur.next=node;
    }
    public void remove(int data){
        List node=new  List(data);
        List cur=head;
    while (cur.next!=null){
        if(cur.val==data){
            cur.next=node.next;
            return;
        }else if(cur.next.val==data){
            cur.next=node.next;
            return;
        }
    }
    }
}
