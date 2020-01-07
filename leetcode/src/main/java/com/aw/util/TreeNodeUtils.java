package com.aw.util;

import com.aw.common.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author weihongyi5
 */
public class TreeNodeUtils {

    public static TreeNode buildTree(Integer[] nums) {
        if (nums.length == 0)  {
            return new TreeNode(0);
        }
        Deque<TreeNode> nodeQueue = new LinkedList<>();

        TreeNode root = new TreeNode(nums[0]);
        nodeQueue.offer(root);
        TreeNode cur;
        // 记录当前行节点的数量（注意不一定是2的幂，而是上一行中非空节点的数量乘2）
        int lineNodeNum = 2;
        // 记录当前行中数字在数组中的开始位置
        int startIndex = 1;
        // 记录数组中剩余的元素的数量
        int restLength = nums.length - 1;

        while(restLength > 0) {
            // 只有最后一行可以不满，其余行必须是满的
            //            // 若输入的数组的数量是错误的，直接跳出程序
            //            if (restLength < lineNodeNum) {
            //                System.out.println("Wrong Input!");
            //                return new TreeNode(0);
            //            }
            for (int i = startIndex; i < startIndex + lineNodeNum; i = i + 2) {
                // 说明已经将nums中的数字用完，此时应停止遍历，并可以直接返回root
                if (i == nums.length) {
                    return root;
                }
                cur = nodeQueue.poll();
                if (nums[i] != null) {
                    cur.left = new TreeNode(nums[i]);
                    nodeQueue.offer(cur.left);
                }
                // 同上，说明已经将nums中的数字用完，此时应停止遍历，并可以直接返回root
                if (i + 1 == nums.length) {
                    return root;
                }
                if (nums[i + 1] != null) {
                    cur.right = new TreeNode(nums[i + 1]);
                    nodeQueue.offer(cur.right);
                }
            }
            startIndex += lineNodeNum;
            restLength -= lineNodeNum;
            lineNodeNum = nodeQueue.size() * 2;
        }

        return root;
    }

    public static boolean treeEqual(TreeNode expected, TreeNode actual) {
        List<Integer> l1 = bfs(expected, new ArrayList<>());
        List<Integer> l2 = bfs(actual, new ArrayList<>());

        return Arrays.equals(l1.toArray(), l2.toArray());
    }

    static List<Integer> bfs(TreeNode root, List<Integer> l) {
        if (root == null) {
            return l;
        }
        Queue<TreeNode> queue = new LinkedBlockingDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            l.add(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        TreeNode treeNode = buildTree(new Integer[]{5, 4, 11, 7, 2, 8, 13, 4, 1});

        System.out.println(bfs(treeNode, new ArrayList<>()));
    }
}
