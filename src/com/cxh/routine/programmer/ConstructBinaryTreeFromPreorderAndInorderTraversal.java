package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import javafx.geometry.Pos;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2024-02-01 16:47
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {

    }
    //preorder = [3,9,20,15,7] 中左右
    //inorder = [9,3,15,20,7] 左中右
    HashMap<Integer,Integer> map = null;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }
    public TreeNode build(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd){
        if (preStart>=preEnd || inStart>=inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart],null,null);
        int index = map.get(preorder[preStart]);
        int leftLen = index-inStart;
        root.left = build(preorder, preStart+1,preStart+leftLen+1,inorder, inStart, index);
        root.right = build(preorder, preStart+leftLen+1, preEnd, inorder, index+1, inEnd);
        return root;
    }

}
