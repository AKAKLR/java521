import java.util.Scanner;

public class javadome {
    public static void main(String[] args) {
        int a=2;
        int i=2;
        boolean f=false;
        for(a=2;a<100;a++){
            for(i=2;i<a;i++){
                if(a%i==0){
                    f=truee;
                    break;
                }
            }
             if(f){
                 f=false;
                 continue;
             }
            System.out.println(a);
        }
    }
}
