package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-13 11:30
 */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {

    }
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1,s.length()*2-1).contains(s);
    }
}
