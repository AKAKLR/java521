import java.util.Stack;

public class TestDome {
    public static void quickSort(int[] array){
        Stack<Integer>stack=new Stack<>();
        int left=0;
        int right=array.length-1;
        int pivot=partition(arrray,left,right);
        if(pivot>left+1){
            stack.push(pivot-1);
            stack.push(left);
        }
        if(pivot+1<right){
            stack.push(pivot+1);
            stack.push(right);
        }
        while (!stack.isEmpty()){
            right=stack.pop();
            left=stack.pop();
            int pivot=partition(arrray,left,right);

        }

    }
    public static void main(String[] args) {

    }
}
