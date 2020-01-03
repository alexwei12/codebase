package com.aw.leetcode;

import com.aw.common.ListNode;

/**
 * 使用递归，
 * 退出条件：当前是空或者是最后一个节点
 * 操作：交换head和next
 * 下一层：next.next
 *
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
