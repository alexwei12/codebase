package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0002Test {

    @Test
    public void addTwoNumbers() {
        Assert.assertEquals(1, new n0002().addTwoNumbers(n0002.createNode(1), n0002.createNode(0)).val);
    }
}