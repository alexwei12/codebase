package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 115477 on 2019/8/26.
 */
public class n0070Test {

    @Test
    public void climbStairs() {


        Assert.assertEquals(2, new n0070().climbStairs1(2));
        Assert.assertEquals(3, new n0070().climbStairs1(3));
    }
}