package com.aw.leetcode;

import com.aw.util.ArrayUtils;

/**
 * 动态规划。当i时，如果dp[i-1]正，则dp[i] = dp[i-1] + 当前值；dp[i-1]为负，则 dp[i] = 当前值
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

    public int maxSubArray1(int[] nums) {
        if (nums.length ==0) {
            return 0;
        }

        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i=1;i<nums.length;i++) {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        ArrayUtils.printArray(dp, nums.length);
        return max;
    }
}
