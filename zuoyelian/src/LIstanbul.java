import java.util.List;

class Node {
   public int val;
   public Node next;
   public Node(int val){
       this.val=val;
   }
}
public class LIstanbul {
    public Node head;

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void First(int date) {
        Node node = new Node(date);
        if (head == null) {
            head= node ;
        } else {
            node.next=head;
            head=node;
        }
    }
    public void List(int date){
        Node node = new Node(date);
        Node cur = this.head;
        if (head==null){
            head=node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next=node;
    }
    public Node allRemove(int date){
        Node prev=this.head;
        if(head==null){
            return null;
        }
        Node cur=this.head.next;
        while (cur!=null){
            if (cur.val==date){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }

        }
        if (head.val==date){
            head=head.next;
        }
        return head;
    }
}