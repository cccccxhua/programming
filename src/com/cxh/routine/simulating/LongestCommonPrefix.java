package com.cxh.routine.simulating;

import javax.sql.rowset.FilteredRowSet;

/**
 * @author CXH
 * @description
 * @create 2023-11-28 11:17
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"cir","car"}));
    }
    public static String longestCommonPrefix(String[] strs){
        String res = strs[0];
        for (int i=1;i<strs.length;i++){
            //比较两个最长的前缀
            res = getPrefix(strs[i],res);
        }
        return res;
    }
    public static String getPrefix(String a,String b){
        for (int i=0;i< Math.min(a.length(),b.length());i++){
            if (a.charAt(i)!=b.charAt(i)){
                return a.substring(0, i);
            }
        }
        return a.length()<b.length()?a:b;
    }
}
