package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import javafx.util.converter.NumberStringConverter;

/**
 * @author CXH
 * @description
 * @create 2024-02-27 14:37
 */
public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        //高度平衡的二叉树指的是叶子节点高度差距为0或者1；
        //-10,-3,0,5,9
        return helper(nums, 0, nums.length-1);
    }
    public TreeNode helper(int[] nums,int left,int right){
        if (left>right){
            return null;
        }
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid],null,null);
        root.left = helper(nums, left, mid-1);
        root.right = helper(nums, mid+1, right);
        return root;
    }
}
