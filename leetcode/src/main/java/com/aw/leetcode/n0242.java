package com.aw.leetcode;

import java.util.Arrays;

/**
 * @author weihongyi5
 */
public class n0242 {

    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }
}
