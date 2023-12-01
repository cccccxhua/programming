package com.cxh.routine.simulating;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2023-11-27 14:39
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        int res = 0;
        int len = s.length();
        for (int i=0;i<len;i++){
            if (i+1<len){
                String tmp = s.substring(i,i+2);
                if (map.containsKey(tmp)){
                    res+=map.get(tmp);
                    i++;
                }else{
                    res+=map.get(s.substring(i,i+1));
                }
            }else{
                res+=map.get(s.substring(i,i+1));
            }
        }
        return res;
    }
}
