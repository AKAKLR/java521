import java.security.KeyStore;
class NameException extends RuntimeException{
    public NameException(String name){
        super(name);
    }
}
class PasswordException extends  RuntimeException{
    public PasswordException(String message){
        super(message);
    }
}
public class Testdome2 {
    private static final String name="bit";
    private static final String password="123";
    public static void login(String name,String password){
        if(!Testdome2.name.equals(name)){
            throw new NameException("用户名错误");
        }
        if(!Testdome2.password.equals(password)){
            throw new PasswordException("密码错误");
        }
    }

    public static void main(String[] args) {
        try {
            login("byit","12344");
        }catch (NameException e){
            System.out.println("用户名错误！");
        }catch (PasswordException e){
            System.out.println("密码错误了");
        }finally {
            System.out.println("finally执行了");
        }

    }
}
