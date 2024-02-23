package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;

import javax.print.attribute.standard.PresentationDirection;
import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2024-02-22 13:53
 */
public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
    public static void main(String[] args) {

    }
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        //preorder = [1,2,4,5,3,6,7] 中左右
        //postorder = [4,5,2,6,7,3,1] 左右中
        for (int i=0;i<postorder.length;i++){
            map.put(postorder[i],i);
        }
        return builder(preorder, 0, preorder.length-1, postorder, 0, postorder.length-1);
    }
    public TreeNode builder(int[] preorder,int preStart,int preEnd,int[] postorder,int postStart,int postEnd){
        if (preStart>preEnd || postStart>postEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart],null,null);
        int leftLen = 0;
        if (preStart<preEnd){
            leftLen = map.get(preorder[preStart + 1])-postStart+1;
        }
        root.left = builder(preorder,preStart+1,preStart+leftLen, postorder, postStart, postStart+leftLen-1);
        root.right = builder(preorder, preStart+leftLen+1, preEnd, postorder, postStart+leftLen, postEnd-1);
        return root;
    }
}
