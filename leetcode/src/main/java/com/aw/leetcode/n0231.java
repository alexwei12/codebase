package com.aw.leetcode;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0231 {


    public boolean isPowerOfTwo(int n) {
        if (n == 0 ) {
            return false;
        }
        if (n < (-2 ^ 32) ) {
            return false;
        }
        return (n & n-1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(new n0231().isPowerOfTwo(0));
        System.out.println(new n0231().isPowerOfTwo(2));
        System.out.println(new n0231().isPowerOfTwo(5));
        System.out.println(new n0231().isPowerOfTwo(64));
        System.out.println(new n0231().isPowerOfTwo(-2147483648));
    }
}
