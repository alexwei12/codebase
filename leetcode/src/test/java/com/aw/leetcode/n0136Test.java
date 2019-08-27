package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alex on 2019/8/27.
 */
public class n0136Test {
    @Test
    public void singleNumber() throws Exception {
        Assert.assertEquals(1, new n0136().singleNumber(new int[]{2,2,1}));
        Assert.assertEquals(4, new n0136().singleNumber(new int[]{4,1,2,1,2}));
    }

}