package com.aw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解法0：O(n^2)
 * c = -(a+b)
 * 做一个set，
 * 两重循环，得到a+b，再从set里找 -c
 *
 *
 * 解法1：O(n^2) 空间少
 * 先排序
 * 循环，再用双指针
 * a，双指针分别是剩下元素的头和尾
 * 如果 a + head + tail > 0 则 tail的指针左移
 * 如果 a + head + tail < 0 则 head的指针右移
 * 知道 head tail相遇
 */
public class n0015 {

    /**
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        if (nums.length < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++) {
            if (i ==0 || nums[i] != nums[i-1]) {
                int lo = i + 1;
                int hi = nums.length -1;
                int sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        ans.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        //去掉重复的情况，多加一次
                        while (lo < hi && nums[lo] == nums[lo + 1]) {
                            lo++;
                        }
                        while (lo < hi && nums[hi] == nums[hi - 1]) {
                            hi--;
                        }
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] > sum) {
                        hi--;
                    } else {
                        lo++;
                    }
                }
            }
        }
        return ans;
    }
}
