package com.aw.leetcode;

/**
 * @author weihongyi5
 */
public class n0011 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxarea = 0;
        while(l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int a = new n0011().maxArea(new int[]{1,8,6,2,5,4,8,3,7});

        if (a != 49) {
            throw new RuntimeException();
        }
    }
}
