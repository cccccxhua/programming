package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

/**
 * @author CXH
 * @description
 * @create 2024-01-31 14:38
 */
public class PathSum {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(5, new TreeNode(4, new TreeNode(11, null, null), null), new TreeNode(8, new TreeNode(13, null, null), new TreeNode(4, null, null)));
        System.out.println(hasPathSum(node, 26));
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null){
            return false;
        }
        if (root.left==null && root.right == null && targetSum==root.val){
            return true;
        }
        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);
        return left || right;
    }
}
