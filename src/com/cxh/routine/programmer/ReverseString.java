package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-13 9:55
 */
public class ReverseString {
    public static void main(String[] args) {

    }
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while (l<r){
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
}
