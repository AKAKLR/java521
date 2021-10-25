public class javadome {


    public static int erfen(int[] array, int k) {
        int a = 0;
        int b = array.length - 1;
        while (a < b) {
            int mid = (a + b) / 2;
            if (array[mid] < k) {
                a = mid + 1;
            } else if (array[mid] > k) {
                b = mid - 1;
            } else {
                return mid;
            }
        }
        return  -1;
        }
        public static void main(String[]args){
            int[] arr = {1, 2, 3, 4, 5, 6};
            System.out.println(erfen(arr, 5));

        }



}
