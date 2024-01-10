package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author CXH
 * @description
 * @create 2023-12-20 9:34
 */
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        DFS(root, ans);
        return ans;
    }
    public void DFS(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        DFS(root.left, list);
        list.add(root.val);
        DFS(root.right, list);
    }
    public void DFS1(TreeNode root,List<Integer> list){
        Stack<TreeNode> stack = new Stack<>();
        if (root!=null){
            stack.push(root);
        }
        while (!stack.isEmpty()){
            TreeNode node = stack.peek();
            if (node!=null){
                TreeNode pop = stack.pop();
                if (node.right!=null){
                    stack.push(node.right);
                }
                stack.push(pop);
                stack.push(null);
                if (node.left!=null){
                    stack.push(node.left);
                }
            }else{
                stack.pop();
                list.add(stack.pop().val);
            }
        }
    }
}
