public class pjshu {
    public static int avc(int[]arr,int a) {
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<right){
            mid=(left+right)/2;
            if(mid>a){
                right=mid-1;
            }else if(mid<a){
                left=mid+1;
            }else {
                mid=a-1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        System.out.println(avc(arr,2));

}
    }

