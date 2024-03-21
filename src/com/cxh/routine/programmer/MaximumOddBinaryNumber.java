package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-13 15:29
 */
public class MaximumOddBinaryNumber {
    public static void main(String[] args) {

    }
    public String maximumOddBinaryNumber(String s) {
        int cnt = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)-'0'==1){
                cnt++;
            }
        }
        String ans = "";
        for (int i=cnt;i<s.length();i++){
            ans+="0";
        }
        for (int i=0;i<cnt-1;i++){
            ans = "1" + ans;
        }
        ans+="1";
        return ans;
    }
}
