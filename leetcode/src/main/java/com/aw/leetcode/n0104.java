package com.aw.leetcode;

import com.aw.common.TreeNode;

/**
 * 递归求解
 * Created by alex on 2019/8/26.
 */
public class n0104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
