package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2024-02-23 11:15
 */
public class KthLargestSumInABinaryTree {
    public static void main(String[] args) {

    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root==null){
            return -1;
        }
        Deque<TreeNode> q = new LinkedList<>();
        List<Long> list = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                sum = sum + node.val;
                if (node.left!=null){
                    q.offer(node.left);
                }
                if (node.right!=null){
                    q.offer(node.right);
                }
            }
            list.add(sum);
        }
        int size = list.size();
        if (size<k){
            return -1;
        }
        Collections.sort(list);
        return list.get(size-k);
    }
}
