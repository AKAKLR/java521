import java.util.Arrays;
public class javadome {

    public static int[] maopao(int[] array) {
        int i= array.length-1;
        int j=0;

        for(i=array.length-1;j<i;i--) {
            for (j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                   int a=array[j+1];
                    array[j+1]=array[j];
                    array[j]=a;
                    
                    }
                }

            }
        return array;
    }
    public static void main(String[] args) {
       int []array={1,3,9,4,5,7,8};
       maopao(array);
        System.out.println(Arrays.toString(maopao(array)));
    }
}
