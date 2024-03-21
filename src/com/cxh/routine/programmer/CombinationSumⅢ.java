package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-02-29 14:14
 */
public class CombinationSumⅢ {
    public static void main(String[] args) {
        CombinationSumⅢ com = new CombinationSumⅢ();
        System.out.println(com.combinationSum3(3, 7));

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new LinkedList<>();
        backtracking(k, n, 1, new ArrayList<>(), 0, ans);
        return ans;
    }
    public void backtracking(int k,int n,int idx,List<Integer> path,int sum,List<List<Integer>> ans){
        if (sum==n && path.size()==k){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i=idx;i<=9;i++){
            if (sum+i>n || path.size()>k){
                return;
            }
            sum+=i;
            path.add(i);
            backtracking(k, n, i+1, path, sum, ans);
            sum-=i;
            path.remove(path.size()-1);
        }
    }
}
