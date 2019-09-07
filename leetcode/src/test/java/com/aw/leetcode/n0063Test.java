package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class n0063Test {

    @Test
    public void uniquePathsWithObstacles() {

        Assert.assertEquals(1, new n0063().uniquePathsWithObstacles(new int[][]{new int[]{0},new int[]{0}}));
        Assert.assertEquals(2, new n0063().uniquePathsWithObstacles(new int[][]{new int[]{0,0,0},new int[]{0,1,0},new int[]{0,0,0}}));
    }
}