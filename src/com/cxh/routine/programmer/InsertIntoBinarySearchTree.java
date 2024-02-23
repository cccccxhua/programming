package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

/**
 * @author CXH
 * @description
 * @create 2024-02-21 15:09
 */
public class InsertIntoBinarySearchTree {
    public static void main(String[] args) {

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null){
            return new TreeNode(val, null, null);
        }

        if (root.val>val){
            root.left = insertIntoBST(root.left, val);
        }
        if (root.val<val){
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
