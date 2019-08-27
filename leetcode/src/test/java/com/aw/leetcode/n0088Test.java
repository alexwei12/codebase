package com.aw.leetcode;

import com.aw.util.ArrayUtils;
import org.junit.Test;

/**
 * Created by alex on 2019/8/26.
 */
public class n0088Test {
    @Test
    public void merge() throws Exception {
        n0088 n = new n0088();

        int a[]={2,4,6,8,10,0,0,0};
        int b[]={1,3,5};
        n.merge(a, 5, b, 3 );
        ArrayUtils.printArray(a,  a.length);

        int a1[]={2,4,0,0,0};
        int b1[]={3,5,7};
        n.merge(a1, 2, b1, 3 );
        ArrayUtils.printArray(a1, a1.length);

        int a2[]={12,14,16,18,20,0,0,0};
        int b2[]={1,3,5};
        n.merge(a2, 5, b2, 3 );
        ArrayUtils.printArray(a2,  a2.length);

        int a3[]={2,0};
        int b3[]={3,};
        n.merge(a3, 1, b3, 1 );
        ArrayUtils.printArray(a3, a3.length);

        int a4[]={0,0,0};
        int b4[]={1,3,5};
        n.merge(a4, 0, b4, 3 );
        ArrayUtils.printArray(a4, a4.length);

        int a5[]={2,4,6,8,10,0,0,0};
        int b5[]={11,13,15};
        n.merge(a5, 5, b5, 3 );
        ArrayUtils.printArray(a5,  a5.length);

        int a6[]={2,4,0,0,0,0,0,0};
        int b6[]={1,3,5,7,9,11};
        n.merge(a6, 2, b6, 6 );
        ArrayUtils.printArray(a6, a6.length);
    }

}