package com.cxh.routine.simulating;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2023-11-28 13:47
 */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        String res = "";
        String tmp = "";
        if (n>1){
            tmp = countAndSay(n-1);
        }else {
            return "1";
        }
        int i = 0;
        while (i< tmp.length()){
            int size = 1;
            while (i+1<tmp.length() && tmp.charAt(i+1)==tmp.charAt(i)){
                size++;
                i++;
            }
            res=res+size+tmp.charAt(i);
            i++;
        }
        return res;
    }
}
