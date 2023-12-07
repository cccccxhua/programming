package com.cxh.routine.programmer;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2023-12-07 10:58
 */
public class ValidAnagram {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];
        for (int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
        }
        for (int i=0;i<t.length();i++){
            cnt[t.charAt(i)-'a']--;
        }
        for (int i=0;i<cnt.length;i++){
            if (cnt[i]!=0){
                return false;
            }
        }
        return true;
    }
}
