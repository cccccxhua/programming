package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-02-20 16:56
 */
public class MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args) {

    }
    public int getMinimumDifference(TreeNode root) {
        if (root==null){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        int ans = Integer.MAX_VALUE;
        for (int i=0,j=1;j<list.size();i++,j++){
            ans = Math.min(ans, list.get(j)-list.get(i));
        }
        return ans;
    }
    public void inorderTraversal(TreeNode root, List<Integer> list){
        if (root==null){
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
}
