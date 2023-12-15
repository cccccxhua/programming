package com.cxh.routine.programmer;

import java.security.cert.TrustAnchor;

/**
 * @author CXH
 * @description
 * @create 2023-12-13 10:55
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }
    public static int strStr(String haystack, String needle) {
        if (needle.length()>haystack.length()){
            return -1;
        }
        for (int i=0;i<haystack.length()-needle.length()+1;i++){
            if (haystack.charAt(i)==needle.charAt(0)){
                int equal = isEqual(haystack, needle, i, i + needle.length());
                if (equal!=-1){
                    return i;
                }
            }
        }
        return -1;
    }
    public static int isEqual(String s1,String s2,int l,int r){
        int idx = 0;
        while (l<r){
            if (s1.charAt(l)!=s2.charAt(idx)){
                return -1;
            }
            l++;
            idx++;
        }
        return l;
    }
}
