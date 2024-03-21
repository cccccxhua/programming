package com.cxh.routine.programmer;

import java.util.Arrays;

/**
 * @author CXH
 * @description
 * @create 2024-03-15 10:26
 */
public class AssignCookies {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int idx = g.length-1;
        for (int i=s.length-1,j=g.length-1;i>=0 && j>=0;){
            if (s[i]>=g[j]){
                ans++;
                i--;
            }
            j--;
        }
        return ans;
    }
}
