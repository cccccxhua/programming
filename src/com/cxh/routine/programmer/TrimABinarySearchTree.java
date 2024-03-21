package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import com.sun.corba.se.spi.logging.LogWrapperFactory;
import sun.reflect.generics.tree.Tree;

/**
 * @author CXH
 * @description
 * @create 2024-02-26 16:52
 */
public class TrimABinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(0, null, new TreeNode(2, new TreeNode(1, null, null),null)),new TreeNode(4, null, null));
        TreeNode node = trimBST(root, 1, 3);
    }
    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if (root==null){
            return null;
        }
        if (root.val<low){
            return trimBST(root.right, low, high);
        }
        if (root.val>high){
            return trimBST(root.left, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
