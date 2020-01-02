package com.aw.leetcode;

import com.aw.common.ListNode;

/**
 * 快慢指针，快的走两步，慢的走一步，如果有环一定会追上。
 *
Created by 115477 on 2019/8/27.
 */
public class n0141 {


    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (true) {
            slow = slow.next;
            fast = fast.next.next;

            //循环退出条件之一是走到头了
            if (fast == null || fast.next == null) {
                break;
            }
            if (fast == slow) {
                return true;
            }
        }

        return fast == slow;
    }


}
