package com.cxh.routine.programmer;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2024-03-01 14:33
 */
public class CombinationSumⅡ {
    public static void main(String[] args) {
        CombinationSumⅡ combinationSumⅡ = new CombinationSumⅡ();
        System.out.println(combinationSumⅡ.combinationSum2(new int[]{1, 1, 1, 1, 1}, 3));
    }
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, new ArrayList<>());
        return ans;
    }
    public void backtracking(int[] candidates,int target,int idx,List<Integer> path){
        if (target==0){
           ans.add(new ArrayList<>(path));
            return;
        }
        for (int i=idx;i<candidates.length;i++){
            if (target-candidates[i]<0){
                continue;
            }
            if (i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
            target-=candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, i+1, path);
            path.remove(path.size()-1);
            target+=candidates[i];
        }
    }
}
