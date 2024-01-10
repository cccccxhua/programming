package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 14:01
 */
public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null){
            return ans;
        }
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                max = Math.max(max,node.val);
                if (node.left!=null){
                    q.offer(node.left);
                }
                if (node.right!=null){
                    q.offer(node.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}
