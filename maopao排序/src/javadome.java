public class javadome {
    public static int maopao(int arr[]) {
        int count=0;
        for(int a=0;a<arr.length;a++){
            for(int b=0;b<arr.length;b++){
                if(arr[a]>arr[b]){
                   count++;
                }else  if(arr[a]<arr[b]){
                    count--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
         int[]arr={1,7,9,4};
       if( maopao(arr)==0){
           System.out.println("有序");
        }else {
           System.out.println("无序");
       }
    }
}
