package com.aw.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 115477 on 2019/8/26.
 */
public class n0026Test {

    @Test
    public void removeDuplicates() {
        n0026 n = new n0026();

        int[] nums = {1,1,2};
        int i1 = n.removeDuplicates(nums);
        Assert.assertEquals(2, i1);
        Assert.assertTrue(arrayEqual(new int[]{1, 2}, nums));
    }

    private static boolean arrayEqual(int[] n1, int[] n2) {


        for (int i=0;i<n1.length;i++) {
            if (n1[i]!= n2[i]) {
                return false;
            }
        }
        return true;
    }
}