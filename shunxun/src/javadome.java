public class javadome {
    public static int[] nihuan(int[]arr) {
        int left=0;
        int right= arr.length-1;
      while(left<right){
          while (left<right&&arr[left]%2==0){
              left++;
          }
          while (left<right&&arr[right]%2!=0){
              right--;
          }
          int tmp=arr[left];
          arr[left]=arr[right];
          arr[right]=tmp;

}
return arr;
    }
    public static void main(String[] args) {
        int []arr={1,5,3,6};
         nihuan(arr);
          for(int i=0;i< arr.length;i++){
          System.out.println(arr[i]);
}
    }
}
