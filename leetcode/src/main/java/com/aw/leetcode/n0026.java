package com.aw.leetcode;

/**
 * Created by 115477 on 2019/8/26.
 */
public class n0026 {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        if (l <= 1) {
            return l;
        }
        int tail = 1;
        for (int i = 1;i<l;i++) {
            if (nums[i-1] != nums[i]) {
                nums[tail] = nums[i];
                tail++;
            }
        }
        return tail;
    }
}
