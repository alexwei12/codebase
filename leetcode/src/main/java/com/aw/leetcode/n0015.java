package com.aw.leetcode;

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

        return null;
    }
}
