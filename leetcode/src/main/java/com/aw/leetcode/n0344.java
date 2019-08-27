package com.aw.leetcode;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0344 {

    public void reverseString(char[] s) {

        int b = 0;
        int e = s.length - 1;
        while (e >= b) {
            char tp = s[b];
            s[b] = s[e];
            s[e] = tp;

            e--;
            b++;
        }
    }
}
