package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import sun.security.krb5.Asn1Exception;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 11:05
 */
public class BinaryTreeLevelOrderTraversalⅡ {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left!=null){
                    q.offer(node.left);
                }
                if (node.right!=null){
                    q.offer(node.right);
                }
            }
            ans.add(list);
        }
        Collections.reverse(ans);
        return ans;
    }
}
