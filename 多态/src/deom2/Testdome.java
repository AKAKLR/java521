package deom2;
    class Animal {
        public String name="erzi";
        public Animal(String name) {
            this.name = name;
        }
    }


class Cat extends Animal {
public String name="sb";
public Cat(String name){
    super(name);
}


             }
public class Testdome {
    public static void main(String[] args) {
        Animal dog=new Cat("ERZI");
        System.out.println(dog.name);

    }

}