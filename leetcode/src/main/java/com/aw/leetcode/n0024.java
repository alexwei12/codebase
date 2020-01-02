package com.aw.leetcode;

import com.aw.common.ListNode;

/**
 * @author weihongyi5
 */
public class n0024 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;

    }
}
