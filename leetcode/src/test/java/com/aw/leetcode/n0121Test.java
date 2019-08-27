package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alex on 2019/8/26.
 */
public class n0121Test {
    @Test
    public void maxProfit() throws Exception {
        Assert.assertEquals(5, new n0121().maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0, new n0121().maxProfit(new int[]{7,6,4,3,1}));

    }

}