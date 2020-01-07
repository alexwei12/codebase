package com.aw.leetcode;

import com.aw.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author weihongyi5
 */
public class n0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            if (!stack.isEmpty()) {
                node = stack.pop();
                r.add(node.val);
                node = node.right;
            } else if (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return r;
    }
}
