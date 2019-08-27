package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0557Test {

    @Test
    public void reverseWords() {
        Assert.assertEquals("a", new n0557().reverseWords("a"));
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", new n0557().reverseWords("Let's take LeetCode contest"));
    }
}