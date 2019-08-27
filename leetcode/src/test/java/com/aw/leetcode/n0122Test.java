package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alex on 2019/8/27.
 */
public class n0122Test {
    @Test
    public void maxProfit() throws Exception {
        Assert.assertEquals(7, new n0122().maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(4, new n0122().maxProfit(new int[]{1,2,3,4,5}));
        Assert.assertEquals(0, new n0122().maxProfit(new int[]{7,6,4,3,1}));
    }

}