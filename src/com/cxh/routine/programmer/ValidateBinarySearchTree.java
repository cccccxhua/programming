package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

/**
 * @author CXH
 * @description
 * @create 2024-02-19 15:45
 */
public class ValidateBinarySearchTree {
    public static void main(String[] args) {

    }
    public TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        boolean left = isValidBST(root.left);
        if (pre!=null && pre.val>=root.val){
            return false;
        }
        pre = root;
        boolean right = isValidBST(root.right);
        return left && right;
    }
}
