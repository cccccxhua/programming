package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 11:16
 */
public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2, null, new TreeNode(5,null,null));
        TreeNode right = new TreeNode(3, null, new TreeNode(4, null, null));

        List<Integer> list = rightSideView(new TreeNode(1, left, right));
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null){
            return ans;
        }
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                if (node.left!=null){
                    q.offer(node.left);
                }
                if (node.right!=null){
                    q.offer(node.right);
                }
                if (i==size-1){
                    ans.add(node.val);
                }
            }
        }
        return ans;
    }
}
