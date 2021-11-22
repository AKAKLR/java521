package dome1;
class  Shape {
    public void draw() {
        System.out.println("Shape的drawfangfa");
    }
}
    class Rect extends Shape{
    public void draw(){
        System.out.println("♦");
    }
        }
    class Flower extends Shape{
        public void draw(){
            System.out.println("❀");
        }
    }
    class ERGOU extends  Shape{
        public  void draw() {
            System.out.println("师靖怡真狗");

        }
    }
public class Test {
    public static void drawmap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Rect rect = new Rect();
        Flower flower = new Flower();
        ERGOU ergou=new ERGOU();
        Shape[] shapes1 = {rect, flower, rect,ergou};
        for(Shape shape: shapes1){
            drawmap(shape);
        }
    }


    public static void main3(String[] args) {
            Rect  rect =new Rect();
            Flower flower =new Flower();
            String []shapes={"rect","flower","rect"};
        Shape []shapes1={rect,flower,rect};
        for (String s:shapes) {//for each 循环指的是从1开始循环直到结束。
            if(s.equals("rect")){
                rect.draw();
            }else if(s.equals("flower")){
                flower.draw();
            }
                
            }
    }
    public static void main2(String[] args) {
        drawmap(new Flower());
        drawmap(new Rect());
    }
    public static void main1(String[] args) {
        Shape shape1=new Rect();
        shape1.draw();
        Shape shape2=new Flower();
        shape2.draw();
        }
}


