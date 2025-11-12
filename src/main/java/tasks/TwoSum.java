package tasks;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 3;
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > 0; j--) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;

    }
}
