import java.util.Scanner;

public class javadome {
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"-->"+pos2+"   ");
    }

    public static void hannuo(int n,char pos1,char pos2,char pos3) {
if(n==1){
    move(pos1,pos3);
}else {
    hannuo(n-1,pos1,pos3,pos2);
    move(pos1,pos3);
    hannuo(n-1,pos2,pos1,pos3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        hannuo(a,'a','b','c');
    }
}
