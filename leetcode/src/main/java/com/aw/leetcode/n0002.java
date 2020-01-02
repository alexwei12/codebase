package com.aw.leetcode;

import com.aw.common.ListNode;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode c = result;
        ListNode n1 = l1;
        ListNode n2 = l2;
        int sum = 0;

        while (n1 != null || n2 != null) {
            sum /= 10;
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            c.next = new ListNode(sum % 10);
            c = c.next;

        }
        if (sum / 10 != 0) {
            c.next = new ListNode(1);
        }

        return result.next;
    }

    public static ListNode createNode(int x) {
        return new ListNode(x);
    }


}