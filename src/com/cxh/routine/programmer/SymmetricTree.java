package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 15:38
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                if (node==null){
                    list.add(101);
                    continue;
                }
                list.add(node.val);
                q.offer(node.left);
                q.offer(node.right);
            }
            if (!check(list)){
                return false;
            }
        }
        return true;
    }
    public boolean check(List<Integer> list){
        int size = list.size();
        for (int i=0;i<size/2;i++){
            if (list.get(i)!=list.get(size-i-1)){
                return false;
            }
        }
        return true;
    }
}
