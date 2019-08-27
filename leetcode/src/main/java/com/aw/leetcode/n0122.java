package com.aw.leetcode;

/**
 * 相邻两个数递增，把所有的递增值相加
 * Created by alex on 2019/8/27.
 */
public class n0122 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i=1;i<prices.length;i++) {
            if (prices[i] > prices[i-1]) {
                max = max + prices[i] - prices[i-1];
            }
        }
        return max;
    }
}
