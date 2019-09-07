package com.aw.leetcode;


import java.util.Arrays;

/**
 * f(m,n) = f(m-1,n) + f(m,n-1)
 * 初始数据是第一列和第一行都是1
 */
public class n0062 {


    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        Arrays.fill(dp[0], 1);
        for (int i=0;i<m;i++) {
            dp[i][0] = 1;
        }

        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
