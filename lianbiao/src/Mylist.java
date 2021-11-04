class List{
    public int val;
    public List nest;//节点类型
    public List(int val){ //构造方法
        this.val=val;
    }
}
public class Mylist {
    public List head;
    public void creatlist(){
    List list1=new List(1);
    List list2=new List(2);
    List list3=new List(3);
    List list4=new List(4);
    List list5=new List(5);
    list1.nest=list2;
    list2.nest=list3;
    list3.nest=list4;
    list4.nest=list5;
    this.head=list1;
}
public void display(){
        List cur=this.head;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.nest;
        }
    System.out.println();
}
public boolean contains(int key){
    List cur=this.head;
    while (cur!=null){
        if(cur.val==key) {
            return true;
        }
        cur=cur.nest;
    }
        return false;
}
public int num(){
        int count=0;
    List cur=this.head;
    while (cur!=null){
        count++;
        cur = cur.nest;
    }
    return count;
}


}
