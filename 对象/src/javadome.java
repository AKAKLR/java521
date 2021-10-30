class Person{
    private String name;
    private int age;
public Person(){
    System.out.println("");
}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String myName){
        name =myName;
    }
    public String getName(){
        return name;
    }
    }

public class javadome {
    public static void main(String[] args) {
        Person person=new Person();//实例化一个对象
        person.setName("bit");
        System.out.println(person.getName());

    }
}
