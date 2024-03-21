package com.cxh.routine.programmer;

import org.omg.CosNaming._NamingContextImplBase;

import javax.sql.rowset.FilteredRowSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-02-29 13:52
 */
public class Combinations {
    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        combinations.combine(4, 2);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(n, k, 1, new ArrayList<>(), ans);
        return ans;
    }
    public void backtracking(int n,int k,int idx,List<Integer> path,List<List<Integer>> ans){
        if (path.size()==k){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = idx;i<=n-(k-path.size())+1;i++){
            path.add(i);
            backtracking(n, k, i+1, path, ans);
            path.remove(path.size()-1);
        }
    }

}
