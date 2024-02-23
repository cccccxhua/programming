package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2024-02-20 17:04
 */
public class FindModeInBinarySearchTree {
    public static void main(String[] args) {

    }
    HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        if (root==null){
            return null;
        }
        helper(root);
        int cnt = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            cnt = Math.max(cnt, entry.getValue());
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (cnt == entry.getValue()){
                list.add(entry.getKey());
            }
        }
        int[] ans = new int[list.size()];
        for (int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public void helper(TreeNode root){
        if (root==null){
            return;
        }
        helper(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        helper(root.right);
    }
}
