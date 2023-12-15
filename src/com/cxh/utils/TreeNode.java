package com.cxh.utils;

/**
 * @author CXH
 * @description
 * @create 2023-12-15 14:28
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){};
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val= val;
        this.left = left;
        this.right = right;
    }
}
