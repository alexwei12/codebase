package com.aw.leetcode;

import java.util.Arrays;

/**
 *
 * 还是f(m,n) = f(m-1,n) + f(m,n-1)，增加对obs的值的判断
 * 初始数据：第1行如果obs对应位置是1，则剩下的都是0，否则是1；第1列同理
 *
 * 计算dp[i][j] 时，如果对应 obs[i][j] 是1，则设为0，否则还是dp[i-1][j] + dp[i][j-1]
 *
 */
public class n0063 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length ==0) {
            return 0;
        }
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        //初始化0
        Arrays.fill(dp[0], 0);
        for (int i=0;i<n;i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            dp[0][i] = 1;
        }
        for (int i=0;i<m;i++) {
            dp[i][0] = 0;
        }
        for (int i=0;i<m;i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }

        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
