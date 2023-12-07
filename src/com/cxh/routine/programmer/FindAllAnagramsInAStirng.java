package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-12-07 11:40
 */
public class FindAllAnagramsInAStirng {
    public static void main(String[] args) {
        System.out.println(findAnagrams("abacbabc", "abc"));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        //O(mnlogn)
        //O(n)
        List<Integer> res = new ArrayList<>();
        char[] pp = p.toCharArray();
        Arrays.sort(pp);
        String pStr = new String(pp);
        for (int l = 0,r = p.length();r<=s.length();l++,r++){
            String sub = s.substring(l, r);
            char[] tmp = sub.toCharArray();
            Arrays.sort(tmp);
            String subStr = new String(tmp);
            if (pStr.equals(subStr)){
                res.add(l);
            }
        }
        return res;

    }
}
