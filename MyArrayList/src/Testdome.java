class MyArrayList<E>{
    private Object[] elementData;
    private  int usedSize;
    private  static final  Object[] DEF={};
    public MyArrayList(){
            this.elementData=DEF;
    }
    public MyArrayList(int capacity){
        if(capacity>0){
            this.elementData=new  Object[capacity];

        }else if(capacity==0){
            this.elementData=new Object[0];
        }else{
            throw new IllegalAccessException("初始化的源码不能为负数")
        }
    }
public boolean add(E e){
        ensure
}
}
public class Testdome {
}
