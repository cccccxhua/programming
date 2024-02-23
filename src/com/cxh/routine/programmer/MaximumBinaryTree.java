package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2024-02-06 13:59
 */
public class MaximumBinaryTree {
    public static void main(String[] args) {
        MaximumBinaryTree tree = new MaximumBinaryTree();
        int[] nums = {3, 2, 1, 6, 0, 5};
        tree.constructMaximumBinaryTree(nums);
        System.out.println("-");
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length==0){
            return null;
        }
        return helper(nums,0,nums.length);
    }
    public TreeNode helper(int[] nums,int start,int end){
        if (end<=start){
            return null;
        }
        int max = nums[start];
        int index = start;
        for (int i=start;i<end;i++){
            if (nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max, null, null);
        root.left = helper(nums, start, index);
        root.right = helper(nums, index+1, end);
        return root;
    }
}
