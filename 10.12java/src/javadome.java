//public class javadome {
//    public static void main(String[] args) {
//        for(int b=1000;b<=2000;b++){
//            if(b%4==0&&b%100!=0){
//                System.out.println(b);
//            }
//        }
//
//    }
//}
public class javadome {
    public static void main(String[] args) {
        for (int a = 2; a <= 100; a++) {
            boolean sushu = true;
            for (int j = 2; j < a; j++) {
                sushu = false;
                break;
            }
            if (sushu) {
                System.out.println(a);
            }
        }
    }
}

