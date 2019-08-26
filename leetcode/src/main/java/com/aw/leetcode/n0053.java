package com.aw.leetcode;

/**
 * Created by 115477 on 2019/8/26.
 */
public class n0053 {
    public int maxSubArray(int[] nums) {
        if (nums.length ==0) {
            return 0;
        }

        int max = nums[0];
        int dp = nums[0];
        for (int i=1;i<nums.length;i++) {
            dp = nums[i] + (dp > 0 ? dp : 0);
            if (dp > max) {
                max = dp;
            }
        }
        return max;
    }
}
