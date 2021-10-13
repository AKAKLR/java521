public class javadome {
    public static boolean sunxu(int[]array) {
        int i= array.length-1;
        for(int j=0;j<i;j++){
            if(array[j]>array[j+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[]array={1,2,4,8,9};
        sunxu(array);
        System.out.println(sunxu(array));
    }
}
