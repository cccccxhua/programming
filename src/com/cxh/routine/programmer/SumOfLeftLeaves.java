package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import javax.swing.event.TreeWillExpandListener;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author CXH
 * @description
 * @create 2024-01-18 11:03
 */
public class SumOfLeftLeaves {
    public static void main(String[] args) {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
        TreeNode node = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        System.out.println(sumOfLeftLeaves.sumOfLeftLeaves(node));
    }
    static int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        //首先是叶子节点
        //其次是父节点的左子节点
        if (root==null){
            return 0;
        }
        DFS(root);
        return ans;
    }
    public void DFS(TreeNode root){
        if (root==null){
            return;
        }
        if (root.left!=null){
            if (root.left.left==null && root.left.right==null){
                ans+=root.left.val;
            }
            DFS(root.left);
        }
        if (root.right!=null){
            DFS(root.right);
        }
    }
}
