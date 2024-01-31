package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-12-27 10:26
 */
public class BinaryTreePaths {
    public static void main(String[] args) {
        BinaryTreePaths a = new BinaryTreePaths();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5, null, null)), new TreeNode(3, null, null));
        a.binaryTreePaths(root);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        backTracing(root, new ArrayList<Integer>(), ans);
        return ans;
    }

    public void backTracing(TreeNode root,List<Integer> paths,List<String> list){
        paths.add(root.val);
        if (root.left==null && root.right==null){
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<paths.size()-1;i++){
                sb.append(paths.get(i));
                sb.append("->");
            }
            sb.append(paths.get(paths.size()-1));
            list.add(sb.toString());
            return;
        }
        if (root.left!=null){
            backTracing(root.left, paths,list);
            paths.remove(paths.size()-1);
        }
        if (root.right!=null){
            backTracing(root.right, paths, list);
            paths.remove(paths.size()-1);
        }
    }
}
