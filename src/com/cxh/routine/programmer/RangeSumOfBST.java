package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author CXH
 * @description
 * @create 2024-02-26 15:51
 */
public class RangeSumOfBST {
    public static void main(String[] args) {

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int ans = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                if (node.val>=low && node.val<=high){
                    ans+=node.val;
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
