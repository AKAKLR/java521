import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = {0, 1};
        return a;
    }

    // 这个 main 方法就相当于测试用例的代码.
    public static void main(String[] args) {
        Solution solution = new Solution();
        // testcase1
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        if (result.length == 2 && result[0] == 0 && result[1] == 1) {
            System.out.println("testcase1 OK");
        } else {
            System.out.println("testcase1 failed!");
        }

        // testcase2
        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        if (result2.length == 2 && result[0] == 1 && result[1] == 2) {
            System.out.println("testcase2 OK");
        } else {
            System.out.println("testcase2 failed!");
        }
    }
}
