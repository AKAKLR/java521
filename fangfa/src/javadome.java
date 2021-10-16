class preson {
   private int age=18;
    private String name="狗子与";

      void jieshao(){
        System.out.println(name+"今年"+age+"了");
    }
}
public class javadome {
    public static void main(String[] args) {
        preson pre=new preson();
        pre.jieshao();
    }
}
