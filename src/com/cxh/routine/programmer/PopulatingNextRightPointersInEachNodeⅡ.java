package com.cxh.routine.programmer;

import com.cxh.utils.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 14:16
 */
public class PopulatingNextRightPointersInEachNodeⅡ {
    public Node connect(Node root) {
        if (root==null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            Node s = q.peek();
            for (int i=0;i<size;i++){
                Node node = q.poll();
                if (i!=0){
                    s.next = node;
                    s = node;
                }
                if (node.left!=null){
                    q.offer(node.left);
                }
                if (node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        return root;
    }
}
