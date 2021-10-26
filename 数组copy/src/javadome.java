import java.util.Scanner;

public class javadome {
    public static int copy(int[] arr) {
          int count=0;
          int q=0;
        for (int i=0;i< arr.length;i++) {
        for (int d = 0;d<arr.length;d++) {
                    if(arr[i]==arr[d]){
                        count++;
                    }if(count==1){
               q= arr[i];
                        break;
            }
        }
            }
        return q;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr2=new int[6];
        for(int b=0;b< arr2.length;b++){
            arr2[b]=scanner.nextInt();
        }
        System.out.println( copy(arr2));
    }
}
