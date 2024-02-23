package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * @author CXH
 * @description
 * @create 2024-02-21 14:07
 */
public class LowestCommonAncestorInBST {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return root;
        }
        if (root.val>p.val && root.val>q.val){
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            if (left!=null){
                return left;
            }
        }
        if (root.val<p.val && root.val<q.val){
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (right!=null){
                return right;
            }
        }
        return root;
    }
}
