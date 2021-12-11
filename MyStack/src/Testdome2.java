class Node{
    public int   val;
    public Node next;
    public Node(int val){
        this.val=val;
    }
}
public class Testdome2 {
    public Node first;
    public Node last;
    public  int usedsize;
    /*
    * 入队列
    * */
    public void offer(int val){
        Node node=new Node(val);
        if (first==null){
            first=node;
        }
        node.next=first;
        first=node;
usedsize++;
    }
    /*
     * 出队列
     * */
    public int pol(){
        int date=this.first.val;
        if (this.first.next==null){
            this.first=null;
            this.last=null;
        }else {
            this.first=first.next;
        }
        return date;
    }
    /*
     * 入队列
     * */
    public void peek(){

    }


    }

