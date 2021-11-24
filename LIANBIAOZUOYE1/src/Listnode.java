
 class List {
       public int val;
       public List next;
       public List(int val){
           this.val=val;
       }
}
public class Listnode{
    public List head;

    public void First(int date){
        List node=new List(date);
        node.next=head;//让node指向head
        head=node;//让node为首，
    }
    public void Last(int date){
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
    public void  display(){
        List cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;

        }
        System.out.println();

    }
    public void daoxu(){
        List Pre=head;
        if (head==null){
            return ;
        }
        List Cur=head.next;
        while (Cur.next!=null){
            Cur.next=Pre;
            Pre=Cur;
            Cur=Cur.next;
        }
        head=Cur;
    }
}
