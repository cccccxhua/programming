package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.time.OffsetDateTime;

/**
 * @author CXH
 * @description
 * @create 2024-02-19 15:18
 */
public class SearchInABinarySearchTree {
    public static void main(String[] args) {

    }
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null){
            return null;
        }
        if (root.val==val){
            return root;
        }
        if (root.val>val){
            return searchBST(root.left, val);
        }
        if (root.val<val){
            return searchBST(root.right, val);
        }
        return null;
    }
}
