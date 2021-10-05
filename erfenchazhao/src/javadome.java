import java.util.Scanner;

public class javadome {

    public static int erFen(int array[],int num) {
int i= array.length-1;
int j= 0;
while (j<i){
    int mid=i+j;
    if(num<array[mid]){
        i=mid-1;
    }
    if(num==array[mid]){
        return mid;
    }
    else{
        j=mid+1;
    }
}
return -1;
    }
    public static void main(String[] args) {

int [] array={1,2,3,4,5,6,7,8,9};
int a=0;
Scanner scan=new Scanner(System.in);
        int num =scan.nextInt();
        a=erFen(array,num);
        System.out.println(a);
    }
}
