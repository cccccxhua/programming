package com.cxh.routine.simulating;

/**
 * @author CXH
 * @description
 * @create 2023-11-30 16:31
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
    }
    public static int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length].length();
    }
}
