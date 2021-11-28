 class List {
    public  int val;
    public List next;
     public List(int val) {
         this.val=val;
     }
}
public class ArrList{
   public List head;
    public void FirstAdd(int date ){
        List pre =new List(date);
        if(head==null){
            head=pre;
            return;
        }
        pre.next=head;
        head=pre;
    }
public void display(){
        List cur =this.head;
        while (cur!=null){
            System.out.print(cur.val+" ");
             cur=cur.next;
        }
    System.out.println(" ");
    }

         }





