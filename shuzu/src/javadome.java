import java.lang.reflect.Array;
import java.util.Arrays;


public class javadome {
    public static int [] myStringcopy(int []array){
        int[] array2=new int[array.length];
        for(int i=0;i<array.length;i++){
            array2[i]=array[i];

        }
        return array2;


    }
    public static void main(String[] args) {
        int[] array={7,6,1,54,789};

        int []ret=myStringcopy(array);

        System.out.println(Arrays.toString(ret));
            }
        }



