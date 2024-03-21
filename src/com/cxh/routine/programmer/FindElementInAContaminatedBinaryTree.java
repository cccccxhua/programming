package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author CXH
 * @description
 * @create 2024-03-12 10:22
 */
public class FindElementInAContaminatedBinaryTree {
    public static void main(String[] args) {
        FindElementInAContaminatedBinaryTree f = new FindElementInAContaminatedBinaryTree(new TreeNode(-1, null, new TreeNode(-1, null, null)));
        System.out.println(f.find(1));
        System.out.println(f.find(2));
    }
    Set<Integer> set = new HashSet<>();
    public FindElementInAContaminatedBinaryTree(TreeNode root) {
        root = helper(root);
    }

    public boolean find(int target) {
        if (set.contains(target)){
            return true;
        }
        return false;
    }
    public TreeNode helper(TreeNode root){
        if (root==null){
            return null;
        }
        if (root.val == -1){
            root.val = 0;
            set.add(root.val);
        }
        if (root.left!=null){
            root.left.val = root.val * 2 +1;
            set.add(root.left.val);
            root.left = helper(root.left);
        }
        if (root.right!=null){
            root.right.val = root.val * 2 + 2;
            set.add(root.right.val);
            root.right = helper(root.right);
        }
        return root;
    }
}
