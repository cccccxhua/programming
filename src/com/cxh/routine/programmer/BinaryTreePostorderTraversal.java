package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author CXH
 * @description
 * @create 2023-12-20 10:10
 */
public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        DFS(root, ans);
        return ans;
    }
    public void DFS(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        DFS(root.left, list);
        DFS(root.right, list);
        list.add(root.val);
    }
    public void DFS1(TreeNode root,List<Integer> list){
        Stack<TreeNode> stack = new Stack<>();
        if (root!=null){
            stack.push(root);
        }
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.left!=null){
                stack.push(node.left);
            }
            if (node.right!=null){
                stack.push(node.right);
            }
        }
        Collections.reverse(list);
    }
}
