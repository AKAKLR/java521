 class Person{
    private int age;
    private String name;

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }
public class javadome {
    public static void main(String[] args) {
Person person=new Person();
        Person person2=new Person();
        person.setAge(55);
        person2.setAge(17);
        System.out.println(person.getAge());
        System.out.println(person2.getAge());
    }
}
