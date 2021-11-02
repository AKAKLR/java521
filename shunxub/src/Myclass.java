import java.util.Arrays;
public class Myclass {
    public int[] clem;
    public int num;
public  Myclass(){
    this.clem=new int [10];
    }
    public void display() {
        for (int i=0 ; i < this.num; i++) {
            System.out.print(this.clem[i]+"  ");
        }
        System.out.println();
    }
    public int size() {
        return this.num;
    }
    public void add(int pos,int data){
    if(pos<0||pos>num){
        System.out.println("位置不合法");
        return;
    }
    isfull(pos);
        this.clem=Arrays.copyOf(this.clem,2*clem.length);
    for(int i=num-1;pos<=i;i--){
        this.clem[i+1]=this.clem[i];
    }
    this.clem[pos]=data;
    this.num++;
    }
      public boolean isfull(int pos){
    return this.num==this.clem.length;
}
}
