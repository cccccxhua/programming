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
        backTracing(root, new StringBuilder(), ans);
        return ans;
    }

    public void backTracing(TreeNode root,StringBuilder sb,List<String> list){
        sb.append(root.val);
        if (root.left==null && root.right==null){
            list.add(sb.toString());
            return;
        }
        if (root.left!=null){
            sb.append("->");
            backTracing(root.left, sb,list);
            sb.delete(sb.length()-2,sb.length());
        }
        if (root.right!=null){
            sb.append("->");
            backTracing(root.right, sb, list);
            sb.delete(sb.length()-2,sb.length());
        }


    }
}
