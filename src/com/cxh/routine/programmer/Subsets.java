package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-03-05 14:17
 */
public class Subsets {
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        System.out.println(subsets.subsets(new int[]{1, 2, 3}));
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        backtracking(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
    public void backtracking(int[] nums,int idx,List<Integer> path,List<List<Integer>> ans){
        ans.add(new ArrayList<>(path));
        for (int i=idx;i<nums.length;i++){
            path.add(nums[i]);
            backtracking(nums, i+1, path, ans);
            path.remove(path.size()-1);
        }
    }
}
