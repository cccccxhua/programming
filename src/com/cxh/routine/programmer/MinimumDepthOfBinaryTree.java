package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 14:22
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        int ans = 0;
        if (root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ans++;
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                if (node.left==null && node.right==null){
                    return ans;
                }
                if (node.left!=null){
                    q.offer(node.left);
                }
                if (node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        return ans;
    }
}
