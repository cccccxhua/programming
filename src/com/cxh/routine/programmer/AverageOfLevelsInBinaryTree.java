package com.cxh.routine.programmer;

import com.cxh.utils.TreeNode;
import com.sun.media.sound.RIFFInvalidDataException;
import com.sun.xml.internal.ws.resources.ModelerMessages;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 11:29
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null){
            return ans;
        }
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            Double sum = 0.0;
            for (int i=0;i<size;i++){
                TreeNode node = q.poll();
                sum+=node.val;
                if (node.left!=null){
                    q.offer(node.left);
                }
                if (node.right!=null){
                    q.offer(node.right);
                }
            }
            ans.add(sum/size);
        }
        return ans;
    }
}
