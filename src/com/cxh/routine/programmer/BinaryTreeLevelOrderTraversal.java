package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 10:46
 */
public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        BFS(root, ans);
        DFS(root, ans, 0);
        return ans;
    }
    public void BFS(TreeNode root,List<List<Integer>> ans){
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null){
            return;
        }
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left!=null){
                    q.offer(node.left);
                }
                if (node.right!=null){
                    q.offer(node.right);
                }
            }
            ans.add(list);
        }
    }

    public void DFS(TreeNode root,List<List<Integer>> ans,Integer depth){
        if (root==null){
            return;
        }
        depth++;
        if (ans.size()<depth){
            List<Integer> list = new ArrayList<>();
            ans.add(list);
        }
        ans.get(depth-1).add(root.val);
        DFS(root.left, ans, depth);
        DFS(root.right, ans, depth);

    }

}
