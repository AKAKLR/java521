public class javadome {
    public static void main(String[] args) {
        int []arr={1,3,4,3,4};
        int m=0;
        for(int i=0;i< arr.length;i++){
            m^=arr[i];
        }
        System.out.println(m);
    }
}
