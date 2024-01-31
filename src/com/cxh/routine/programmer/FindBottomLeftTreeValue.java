package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author CXH
 * @description
 * @create 2024-01-18 11:33
 */
public class FindBottomLeftTreeValue {
    public static void main(String[] args) {

    }
    public int findBottomLeftValue(TreeNode root) {
        if (root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int ans = root.val;
        while (!q.isEmpty()){
            int size = q.size();
            long tmp = Long.MIN_VALUE;
            for (int i=0;i<size;i++){
                TreeNode poll = q.poll();
                if (tmp==Long.MIN_VALUE){
                    tmp = (int)poll.val;
                }
                if (poll.left!=null){
                    q.offer(poll.left);
                }
                if (poll.right!=null){
                    q.offer(poll.right);
                }
            }
            if (tmp!=Long.MIN_VALUE){
                ans = (int)tmp;
            }
        }
        return ans;
    }
}
