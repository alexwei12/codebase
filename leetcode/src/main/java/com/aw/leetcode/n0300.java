package com.aw.leetcode;

/**
 * 最长上升子序列的长度
 * dp方式：O(n^2)
 *
 * dp[i] 从头到第i个元素，包含i元素的最长子序列的长度
 * dp[i] = max{dp[j]} + 1  (j: 0..=i-1 且 a[j] < a[i])
 *
 * 结果：dp数组中的最大值
 *
 * 插入二分法构造：O(n * log n)
 * 构造LIS数组，最后LIS的长度就是结果
 * 顺序检查nums中的元素跟LIS数组中元素比较，拿 nums[i] 替换 LIS 中刚好大于 nums[i] 的元素（这里用了二分查找），如果没有则把nums[i]加到LIS最后
 * 在循环中，LIS一直保持最长序列的长度
 *
 * List lis;
 * for (i... {
 *     //找到nums[i] 在 lis中的位置下界，即 nums[i] 刚好小于 lis[lowerBound]
 *     int lowerBound = binarySearch(lis, nums[i]);
 *     if ( lowerBound == lis.length - 1) { //表示 nums[i] 大于 lis 中所有元素
 *         lis.add(nums[i]);
 *     } else { //表示找到了
 *         lis[lowerBound] = nums[i]);   //替换这个元素
 *     }
 * }
 * return lis.size()
 *
 */
public class n0300 {
}
