package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2024-02-01 9:50
 */
public class ConstrustBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {

    }
    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        //inorder = [9,3,15,20,7],左中右
        // postorder = [9,15,7,20,3],左右中
        //如果数组为空，空节点
        if (inorder.length==0 || postorder.length==0){
            return null;
        }
        map = new HashMap<>();
        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode node = buildNode(inorder, 0, inorder.length, postorder, 0, postorder.length);
        return node;
    }
    public TreeNode buildNode(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd){
        if (inStart>=inEnd || postStart>=postEnd){
            return null;
        }
        //找到中间切割点在中序数组中的位置
        Integer delimiterIndex = map.get(postorder[postEnd - 1]);
        TreeNode root = new TreeNode(inorder[delimiterIndex], null, null);
        int inLeft = delimiterIndex-inStart;//左子树的数量
        root.left = buildNode(inorder, inStart, delimiterIndex, postorder, postStart, postStart+inLeft);
        root.right = buildNode(inorder, delimiterIndex+1, inEnd, postorder, postStart+inLeft, postEnd-1);
        return root;
    }

}
