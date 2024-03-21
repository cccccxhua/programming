package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-03-04 14:19
 */
public class PalindromePartitioning {
    public static void main(String[] args) {
        PalindromePartitioning p = new PalindromePartitioning();
        System.out.println(p.partition("aab"));
    }
    List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans = new LinkedList<>();
        backtracking(s, 0, new ArrayList<String>());
        return ans;
    }
    public void backtracking(String s,int idx,List<String> path){
        if (idx>=s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i=idx;i<s.length();i++){
            if (isPalindrome(s.substring(idx, i+1))){
                path.add(s.substring(idx, i+1));
            }else{
                continue;
            }
            backtracking(s, i+1, path);
            path.remove(path.size()-1);
        }
    }
    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
