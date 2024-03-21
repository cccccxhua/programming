package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-03-05 16:03
 */
public class Permutation {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        backtracking(nums,new int[nums.length], new ArrayList<Integer>(),ans);
        return ans;
    }
    public void backtracking(int[] nums,int[] used,List<Integer> path,List<List<Integer>> ans){
        if (path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (used[i]==1){
                continue;
            }
            path.add(nums[i]);
            used[i]=1;
            backtracking(nums,used, path, ans);
            path.remove(path.size()-1);
            used[i]=0;
        }
    }
}
