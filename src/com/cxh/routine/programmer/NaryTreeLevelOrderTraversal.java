package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.cxh.utils.NNode;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 13:48
 */
public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(NNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<NNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<size;i++){
                NNode node = q.poll();
                list.add(node.val);
                List<NNode> children = node.children;
                for (int j=0;j<children.size();j++){
                    if (children.get(j)!=null){
                        q.offer(children.get(j));
                    }
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
