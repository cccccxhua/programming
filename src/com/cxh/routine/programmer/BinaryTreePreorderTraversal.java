package com.cxh.routine.programmer;


import com.cxh.utils.TreeNode;

import java.util.*;
import java.util.concurrent.DelayQueue;

/**
 * @author CXH
 * @description
 * @create 2023-12-15 14:24
 */
public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
//        DFS(root, ans);
        DFS1(root, ans);
        return ans;
    }
    public void DFS(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        list.add(root.val);
        DFS(root.left, list);
        DFS(root.right, list);
    }
    public void DFS1(TreeNode root,List<Integer> list){
        Stack<TreeNode> stack = new Stack<>();
        if (root==null){
            return;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right!=null){
                stack.add(node.right);
            }
            if (node.left!=null){
                stack.add(node.left);
            }
        }
    }
}
