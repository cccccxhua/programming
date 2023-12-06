package com.cxh.routine.programmer;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2023-12-05 15:03
 */
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("a", "aa"));
    }
    public static String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        HashMap<Character, Integer> map = new HashMap<>();//记录t中字符的种类和数量
        HashMap<Character, Integer> count = new HashMap<>();//记录当前子字符串还差什么字符才能包含t
        for (int i=0;i<n;i++){
            char tch = t.charAt(i);
            map.put(tch,map.getOrDefault(tch, 0)+1);
            count.put(tch,count.getOrDefault(tch, 0)+1);
        }
        int l = 0;
        int cnt = n;//记录当前数量
        int res = Integer.MAX_VALUE;
        String ans = "";
        for (int r=0;r<m;r++){
            char sch = s.charAt(r);
            if (!map.containsKey(sch)){
                continue;
            }else if (count.get(sch)>0){
                cnt--;
                count.put(sch, count.get(sch)-1);
            }else{
                count.put(sch, count.get(sch)-1);
            }
            //全都包含t中字符了
            while (cnt==0){
                //记录当前子字符串
                if ((r-l+1)<res){
                    res = r-l+1;
                    ans = s.substring(l, r+1);
                }
                //l开始向前移动
                if (map.containsKey(s.charAt(l)) && count.get(s.charAt(l))==0){
                    cnt++;
                    count.put(s.charAt(l), count.get(s.charAt(l))+1);
                }
                if (map.containsKey(s.charAt(l)) && count.get(s.charAt(l))<0){
                    count.put(s.charAt(l), count.get(s.charAt(l))+1);
                }
                l++;
            }
        }
        return ans;
    }
}
