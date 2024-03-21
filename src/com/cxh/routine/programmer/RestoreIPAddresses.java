package com.cxh.routine.programmer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-03-05 10:23
 */
public class RestoreIPAddresses {
    public static void main(String[] args) {
        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
        System.out.println(restoreIPAddresses.restoreIpAddresses("0000"));
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new LinkedList<>();
        backtracking(s, 0, 0,ans);
        return ans;
    }
    public void backtracking(String s,int idx,int count,List<String> ans){
        if (count==3){
            if (isValid(s.substring(idx, s.length()))){
                ans.add(s);
            }
            return;
        }
        for (int i=idx;i<s.length();i++){
            if (isValid(s.substring(idx, i+1))){
                s = s.substring(0, i+1) + "." + s.substring(i+1,s.length());
                count++;
            }else{
                return;
            }
            backtracking(s,i+2,count, ans);
            count--;
            s = s.substring(0, i+1)+s.substring(i+2, s.length());
        }
    }
    public Boolean isValid(String s){
        if (s.length()>3){
            return false;
        }
        if (s.length()==0){
            return false;
        }
        if (s.length()>1 && s.charAt(0)=='0'){
            return false;
        }
        if (Integer.parseInt(s)<0 || Integer.parseInt(s)>255){
            return false;
        }
        return true;
    }
}
