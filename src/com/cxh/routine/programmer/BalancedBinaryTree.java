package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 18:49
 */
public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, null, null), new TreeNode(4, null, null)), new TreeNode(3,null,null)), new TreeNode(2, null,null));
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        return getDepth(root)==-1?false:true;

    }
    public static int getDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int left = getDepth(root.left);
        if (left==-1){
            return -1;
        }
        int right = getDepth(root.right);
        if (right==-1){
            return -1;
        }
        return Math.abs(left-right)>1?-1:1+Math.max(left,right);
    }
}
