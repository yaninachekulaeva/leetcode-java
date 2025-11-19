package tasks;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int slow = 0;
            int fast = 1;
            while (fast != nums.length) {
                if (nums[fast] != nums[slow]) {
                    slow += 1;
                    nums[slow] = nums[fast];
                } else {
                    fast+=1;
                }
            }
            int k = slow + 1;
            System.out.println(Arrays.toString(nums));
            return k;
        }
    }
}
