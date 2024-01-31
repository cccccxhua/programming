package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-01-31 15:27
 */
public class PathSumⅡ {
    public static void main(String[] args) {

    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root==null){
            return res;
        }
        ArrayList<Integer> path = new ArrayList<>();
        path.add(root.val);
        helper(root, targetSum-root.val, path);
        return res;
    }
    public void helper(TreeNode root,int sum,List<Integer> path){
        if (root.left==null && root.right==null && sum==root.val){
            res.add(new ArrayList<>(path));
            return;
        }
        if (root.left==null && root.right==null){
            return;
        }
        if (root.left!=null){
            path.add(root.left.val);
            helper(root.left, sum-root.val, path);
            path.remove(path.size()-1);
        }
        if (root.right!=null){
            path.add(root.right.val);
            helper(root.right, sum-root.val, path);
            path.remove(path.size()-1);
        }
        return;
    }
}
