package com.aw.leetcode;

/**
 * 出现两次的异或为0
 * Created by alex on 2019/8/27.
 */
public class n0136 {
    public int singleNumber(int[] nums) {

        int s = 0;
        for(int i=0; i<nums.length; i++){
            s = s ^ nums[i];
        }
        return s;
    }
}
