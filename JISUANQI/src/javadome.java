class Jisuanqi{
    public int num1;
    public int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add(){
        return num1+num2;
    }
}
public class javadome {
    public static void main(String[] args) {
    Jisuanqi jisuanqi=new Jisuanqi();
    jisuanqi.setNum1(30);
    jisuanqi.setNum2(10);
        System.out.println(jisuanqi.add());
    }

}
