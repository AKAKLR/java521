interface Run {  void run(); }
interface Swi {  void swi(); }
interface Fly{void fly();}
class dog implements Run{
    @Override
    public void run() {
        System.out.println("正在跑");
    }
}
class Anminal {
    protected  String name;
    public  Anminal(String name){
        this.name=name;
    }
}
class Birds extends Anminal implements Run ,Swi , Fly{
    public Birds(String name) {  super(name);  }
    @Override
    public void run() {
        System.out.println(name+"再跑");
    }

    @Override
    public void swi() {
        System.out.println(name+"在游泳");

    }

    @Override
    public void fly() {
        System.out.println(name+"在飞");
    }
}
public class test4 {
    public static void Walk(Run run) {
        run.run();

    }
    public static void main(String[] args) {
        Birds cat = new Birds("小猫");
        Birds cat2 = new Birds("始建于");
        Walk(cat);
        Walk(cat2);

    }
}