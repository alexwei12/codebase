package com.aw.leetcode;

import com.aw.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author weihongyi5
 */
public class n0144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        if (node == null) {
            return r;
        }
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            r.add(n.val);
            if (n.right != null) {
                stack.push(n.right);
            }
            if (n.left != null) {
                stack.push(n.left);
            }
        }
        return r;
    }
}
