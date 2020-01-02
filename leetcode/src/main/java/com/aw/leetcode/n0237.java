package com.aw.leetcode;

import com.aw.common.ListNode;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
