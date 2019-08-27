package com.aw.leetcode;

import java.util.Stack;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0155 {
    Stack<Integer> s = null;
    // 辅助的栈，高度跟s一致，保存的数字是s中同一位置对应的最小数
    Stack<Integer> assistStack = null;

    /** initialize your data structure here. */
    public n0155() {
        s = new Stack<Integer>();
        assistStack = new Stack<Integer>();
    }

    public void push(int x) {
        s.push(x);
        if (assistStack.isEmpty()) {
            assistStack.push(x);
        } else {
            assistStack.push(Math.min(x, assistStack.peek()));
        }
    }

    public void pop() {
        s.pop();
        assistStack.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return assistStack.peek();
    }
}
