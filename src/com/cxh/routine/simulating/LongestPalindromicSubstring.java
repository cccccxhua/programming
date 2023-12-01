package com.cxh.routine.simulating;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2023-11-23 14:27
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome1("babad"));
    }
    //以每个字符为中心进行左右扩展，找到最长回文子串
    public static String longestPalindrome(String s) {
        String res = "";
        int len = 0;
        for (int i=0;i<s.length();i++){
            //假设最长回文子串长度为奇数
            int l = i-1;
            int r = i+1;
            while (l>=0 && r<s.length() &&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            String sub = s.substring(l+1, r);//substring是左边包含，右边不包含
            if (res.length()<sub.length()){
                res = sub;
            }
            //假设最长回文子串长度为偶数
            l = i;
            r = i+1;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            sub = s.substring(l+1, r);//substring是左边包含，右边不包含
            if (res.length()<sub.length()){
                res = sub;
            }

        }
        return res;
    }
    public static String longestPalindrome1(String s) {
        if (s.length() == 1) return s;

        char[] chars = manacherString(s);
        int n = chars.length;
        int[] pArr = new int[n];
        int C = -1, R = -1, pos = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            pArr[i] = i < R ? Math.min(pArr[C * 2 - i], R - i) : 1;
            while (i + pArr[i] < n && i - pArr[i] > -1) {
                if (chars[i + pArr[i]] == chars[i - pArr[i]]) {
                    pArr[i]++;
                } else {
                    break;
                }
            }
            if (i + pArr[i] > R) {
                R = i + pArr[i];
                C = i;
            }
            if (pArr[i] > max) {
                max = pArr[i];
                pos = i;
            }
        }
        int offset = pArr[pos];
        StringBuilder sb = new StringBuilder();
        for (int i = pos - offset + 1; i <= pos + offset - 1; i++) {
            if (chars[i] != '#') sb.append(chars[i]);
        }
        return sb.toString();
    }
    public static char[] manacherString(String s) {
        char[] chars = new char[s.length() * 2 + 1];
        for (int i = 0, idx = 0; i < chars.length; i++) {
            chars[i] = (i & 1) == 0 ? '#' : s.charAt(idx++);
        }
        //0 & 1 ==0
        //1 & 1 == 1
        //2 & 1 == 0
        //3(0101) & 1 == 1
        //实现了空一格
        return chars;
    }
}
