package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

/**
 * @author CXH
 * @description
 * @create 2024-02-27 14:47
 */
public class ConvertBSTToGreaterTree {
    public static void main(String[] args) {

    }
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if (root==null){
            return null;
        }
        //累加树：每个节点的值等于当前值+书中节点值大于当前节点的值
        //考虑左中右遍历，不然将累加结果会影响其他节点
        //但是左中右遍历需要先统计所有节点值总和，然后每个节点值减去本身值
        //因此考虑右中左遍历，这样是递增，不需要计算总和
        convertBST(root.right);
        sum+=root.val;
        root.val = sum;
        convertBST(root.left);

        return root;
    }

}
