import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
//只能存放整数，能不能啥都放。
///
// 泛型就是把类型给函数化了
// 泛型不能实例化数组
class MyArrayList<E>{
    private Object[]elem;
    private  int usedSize;
    public MyArrayList(){
        this.elem=new Object[10];
    }
    public void add(Object val){
        this.elem[usedSize]=val;
        usedSize++;
    }
    public  Object get(int pos){
        return this.elem[pos];
    }
}
public class Testdome {

    public static void main(String[] args) {
        MyArrayList<String> myArrayList1=new MyArrayList<>();
        MyArrayList<Integer> myArrayList2=new MyArrayList<>();
        MyArrayList<Boolean> myArrayList3=new MyArrayList<>();

        System.out.println(myArrayList1.get(0));
    }




















    public static void main1(String[] args) {
//尖括号中放的类型一定是类类型不能是基本类型
        //int 不行必须要Integer
        Collection<String> collection=new ArrayList<>();
        collection.add("sasaf");
       Collection<Integer>collection1=new ArrayList<>();
       collection1.add(1);
       collection1.add(2);
       collection1.add(3);
        System.out.println(collection);

    }

    public static void main2(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("狗儿子"," 师靖怡");
        map.get("狗儿子");
        map.getOrDefault("狗儿子","二哥");
        System.out.println(map.get("狗儿子"));

    }
}
