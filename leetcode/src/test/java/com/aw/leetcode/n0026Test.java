package com.aw.leetcode;

import com.aw.util.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertTrue(ArrayUtils.arrayEqual(new int[]{1, 2}, nums));
    }

}