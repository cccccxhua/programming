package com.cxh.routine.programmer;

import sun.reflect.annotation.AnnotationSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-03-05 14:30
 */
public class SubsetⅡ {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new LinkedList<>();
        backtracking(nums, 0, ans, new ArrayList<Integer>());
        return ans;
    }
    public void backtracking(int[] nums,int idx,List<List<Integer>> ans,List<Integer> path){
        ans.add(new ArrayList<>(path));
        for (int i=idx;i<nums.length;i++){
            if (i>idx && nums[i]==nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            backtracking(nums, i+1, ans, path);
            path.remove(path.size()-1);
        }
    }
}
