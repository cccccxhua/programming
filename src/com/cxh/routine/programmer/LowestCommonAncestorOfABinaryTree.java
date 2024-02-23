package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

/**
 * @author CXH
 * @description
 * @create 2024-02-21 10:37
 */
public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null || root.val == p.val || root.val==q.val){
            return root;
        }
        //必须从下往上遍历，后序遍历，左右中
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left!=null && right!=null){
            return root;
        }
        if (left!=null){
            return left;
        }
        if (right!=null){
            return right;
        }
        return null;
    }
}
