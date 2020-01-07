package com.aw.leetcode;

import com.aw.common.Node;
import com.aw.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author weihongyi5
 */
public class n0590 {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> r = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        if (root == null) {
            return r;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
//            r.add(0, node.val);
            r.addFirst(node.val);
            if (node.children != null) {
                for (Node child : node.children) {
                    if (child != null) {
                        stack.add(child);
                    }
                }
            }

        }

        return r;
    }
}
