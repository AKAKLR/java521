import java.util.Arrays;

class MyStack{
    public int[] elem;
    public int usesize;
    public MyStack(){
        this.elem=new int[10];
    }
    public boolean isfull(){
        if(elem.length<=usesize){
return true;
    }
return false;
}
public void push(int item){
        if(isfull()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usesize]=item;
        usesize++;
    }
    public void display(){
        for( int i=usesize;i>0;i--){
            System.out.println(elem[i-1]);
        }

    }
}


public class Testdome {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
myStack.display();
    }

}
