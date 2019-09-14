package com.aw.leetcode;

/**
 * dp的方法
 * dp[i][j] : 从底部到（i，j）路径和的最小值
 * 从底往上计算
 * 结果：dp[0][0]
 * dp[i][j] = min(dp[i+1][j], dp[i+1][+1]) + triangle[i][j]
 *
 * 初始值dp最后一行等于三角形的最后一行：dp[m-1][j] = triangle[m-1][j]
 *
 * 因为不需要记中间结果，所以用1维数组保存计算结果即可
 *
 * 暴力方法：
 * 从上到下遍历所有路径
 */
public class n0120 {
}
