package com.aw.leetcode;

import com.aw.util.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0344Test {

    @Test
    public void reverseString() {
        char[] a = new char[]{'o','l','l','e','h'};
        new n0344().reverseString(a);
        Assert.assertTrue(ArrayUtils.arrayEqual(new char[]{'h','e','l','l','o'}, a));


        char[] b = new char[]{'H','a','n','n','a','h'};
        new n0344().reverseString(b);
        Assert.assertTrue(ArrayUtils.arrayEqual(new char[]{'h','a','n','n','a','H'}, b));
    }
}