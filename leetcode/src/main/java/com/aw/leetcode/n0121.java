package com.aw.leetcode;

/**
 * 从前往后，找到最小值，再找最大差异
 * Created by alex on 2019/8/26.
 */
public class n0121 {
    public int maxProfit(int[] prices) {
        int maxDelta = 0;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<prices.length;i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            int delta = prices[i] - min;
            if (delta > maxDelta) {
                maxDelta = delta;
            }
        }

        return maxDelta;
    }
}
