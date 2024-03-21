package com.cxh.routine.programmer;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2024-03-05 15:14
 */
public class NonDecreasingSubsequence {
    public static void main(String[] args) {
        NonDecreasingSubsequence n = new NonDecreasingSubsequence();
        System.out.println(n.findSubsequences(new int[]{1,2,3,1,1,1}));
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        Set<List<Integer>> set = new HashSet<>();
        backtracking(nums, 0, new ArrayList<Integer>(), set);
        for (List<Integer> item:set){
            ans.add(item);
        }
        return ans;
    }
    public void backtracking(int[] nums,int idx,List<Integer> path,Set<List<Integer>> ans){
        if (path.size()>1){
            ans.add(new ArrayList<>(path));
        }
        for (int i=idx;i<nums.length;i++){
            if (i>idx && nums[i]==nums[i-1]){
                continue;
            }
            if (i>0 && path.size()!=0 && nums[i]<path.get(path.size()-1)){
                continue;
            }
            path.add(nums[i]);
            backtracking(nums, i+1, path, ans);
            path.remove(path.size()-1);
        }
    }
}
