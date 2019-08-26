package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 115477 on 2019/8/26.
 */
public class n0053Test {

    @Test
    public void maxSubArray() {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        Assert.assertEquals(6, new n0053().maxSubArray(nums));
    }
}