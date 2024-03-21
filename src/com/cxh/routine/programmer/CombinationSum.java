package com.cxh.routine.programmer;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2024-03-01 14:00
 */
public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
    HashSet<List<Integer>> set = new HashSet<>();
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, 0, target, new ArrayList<>());
        Arrays.sort(candidates);
        return ans;
    }
    public void backtracking(int[] candidates,int sum,int target,List<Integer> path){
        if (sum == target){
            List<Integer> tmp = new ArrayList<>(path);
            Collections.sort(tmp);
            if (!set.contains(tmp)){
                set.add(tmp);
                ans.add(tmp);
            }
            return;
        }
        for (int i=0;i<candidates.length;i++){
            if (sum+candidates[i]>target){
                break;
            }
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, sum, target, path);
            path.remove(path.size()-1);
            sum-=candidates[i];
        }
    }

}
