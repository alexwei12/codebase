package com.aw.leetcode;

/**
 * 建立一个数组，保存从0到i的所有元素之和，求i，j之间的和就只需要做一次减法sums[j] - sums[i-1]
 *
 * 这里的实现技巧是数组的第0位多加了一个0
 */
public class n0303 {

    private int[] sums;

    public n0303(int[] nums) {

        sums = new int[nums.length + 1];

        sums[0] = 0;

        for (int i=0;i<nums.length;i++) {
            sums[i+1] = sums[i] + nums[i];
        }

    }

    public int sumRange(int i, int j) {

        return sums[j+1] - sums[i];
    }

}
