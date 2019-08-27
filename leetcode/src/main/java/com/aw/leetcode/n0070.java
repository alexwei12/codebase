package com.aw.leetcode;

/**
 * f(n) = f(n-1) +f(n-2)
 * Created by 115477 on 2019/8/26.
 */
public class n0070 {
    public int climbStairs(int n) {

        return 0;
    }


    public int climbStairs1(int n) {
        if (n<=1) {
            return 1;
        }

        int a = 1;
        int b = 1;
        int sum = 0;
        for (int i=2;i<=n;i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
