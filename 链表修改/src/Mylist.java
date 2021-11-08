import java.util.Date;
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
    public List serch(int date){
        List cur=head;
        while (cur.next!=null){
            if (cur.next.val==date){
                return cur;
            }
            cur= cur.next;
        }
            return null;
    }

    public void remove(int data){
    List dle=new List(data);
    if(head==null){
         System.out.println("为空不能访问");
         return;
     }
     if (head.val==data){
         head=head.next;
         return;
     }
     List cur=serch(data);
     if (cur==null){
         System.out.println("没有要删除的节点");
         return;
     }else {
         dle=cur.next;
         cur.next=dle.next;
     }
    }
    public List allremove(int data){
        List prev=head;
        List cur=head.next;
        if(head==null){
            return null;
        }
        while (cur!=null){
            if(cur.val==data){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if (head.val==data){
            head=head.next;
        }
        return head;
    }
    public List DAOXU(){
        if(head==null){
            return null;
        }
        List cur=this.head;
        List prec=null;
        while ( cur!=null&&cur.next != null){
            List curNext=cur.next;
            cur.next=prec;
            prec=cur;
            cur=curNext;
            curNext=curNext.next;
        }
        return prec;
        }
        public void display2(List newHead){

            List cur=newHead;
            while (cur!=null){
                System.out.print(cur.val+" ");
                cur=cur.next;
            }
            System.out.println();
        }
        public void middle(){
        if (head==null){
            return;
        }
            List first=this.head;
            List low=this.head;
            while (first!=null&&first.next!=null){
                low=low.next;
                first=first.next.next;
            }

            System.out.println(low.val);
        }
    public List daoshu(int x){
        if (head==null||x>0){
            return null;
        }
        List first=this.head;
        List low=this.head;
        int move=x-1;
        while (move>=0||first!=null&&first.next!=null){
            move--;
            first=first.next;
        }
        while (first!=null&&first.next!=null){
            first=first.next;
            low=low.next;
        }
        return low;

    }
        }


