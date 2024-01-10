package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 18:31
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null){
            return 0;
        }
        int ans = 0;
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            ans+=size;
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
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
