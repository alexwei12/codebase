package com.aw.leetcode;

import com.aw.util.ArrayUtils;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author weihongyi5
 */
public class n0239 {

    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n-k+1];

        return r;
    }

    public static void main(String[] args) {
        int[] ints = new n0239().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        System.out.println(ArrayUtils.arrayEqual(new int[]{3,3,5,5,6,7}, ints));
    }

}
