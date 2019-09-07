package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class n0303Test {

    @Test
    public void sumRange() {

        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};

        n0303 n = new n0303(nums);

        Assert.assertEquals(1, n.sumRange(0,2));
        Assert.assertEquals(-1, n.sumRange(2,5));
        Assert.assertEquals(-3, n.sumRange(0,5));
    }
}