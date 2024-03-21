package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-03-05 16:16
 */
public class PermutationⅡ {
    public static void main(String[] args) {
        PermutationⅡ p = new PermutationⅡ();
        System.out.println(p.permuteUnique(new int[]{1, 1, 2}));
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
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
            if (used[i]==1 || (i>0 && nums[i]==nums[i-1] && used[i-1]==0)){
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
