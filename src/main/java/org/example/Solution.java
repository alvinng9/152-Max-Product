package org.example;

public class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int min = result;
        int max = result;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = min;
                min = max;
                max = temp;
            }

            min = Math.min(nums[i], nums[i] * min);
            max = Math.max(nums[i], nums[i] * max);
            result = Math.max(max, result);
        }
        return result;
    }
}
