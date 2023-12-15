package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-13 10:35
 */
public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("  world hello  "));
    }
    public static String reverseWords(String s) {
        int l = 0;
        int r = 0;
        char[] chars = s.toCharArray();
        String res = "";
        while (l<chars.length) {
            if (chars[l] == ' ') {
                l++;
                continue;
            }
            r = l;
            while (l < chars.length && chars[l] != ' ') {
                l++;
            }
            res = s.substring(r, l) +" " + res;

        }
        return res.substring(0, res.length()-1);
    }

}
