package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * @author CXH
 * @description
 * @create 2024-02-21 15:24
 */
public class DeleteNodeInABST {
    public static void main(String[] args) {

    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null){
            return null;
        }
        if (root.val==key){
            //找到了
            //如果左子树不存在,右子树直接移到root位置
            if (root.left==null){
                return root.right;
            }else if (root.right==null){
                //如果右子树不存在，左子树直接移到root位置
                return root.left;
            }else{
                //都存在，左子树移到右子树的最左侧，右子树移到root位置
                //找到右子树的最左节点
                TreeNode node = root.right;
                while (node.left!=null){
                    node = node.left;
                }
                //左子树移到右子树的最左侧
                node.left = root.left;
                //右子树移到root位置
                root = root.right;
            }
        }
        if (root.val>key){
            //root的值大于key,在左子树找
            root.left = deleteNode(root.left, key);
        }
        if (root.val<key){
            //root的值小于key,在右子树找
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

}
