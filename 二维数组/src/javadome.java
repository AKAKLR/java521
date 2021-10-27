public class javadome {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{5,6,7},{8,9,10}};
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%d\t",arr[i][j]);
            }
        }
        System.out.println("  ");
    }
}
