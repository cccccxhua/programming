package com.cxh.routine.simulating;

import java.io.FileReader;

/**
 * @author CXH
 * @description
 * @create 2023-11-28 14:17
 */
public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("9", "99"));
    }

    public static String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] res = new int[m+n];
        for (int i=n-1;i>=0;i--){
            for (int j=m-1;j>=0;j--){
                int a = num1.charAt(i)-'0';
                int b = num2.charAt(j)-'0';
                int c = a*b;
                c+=res[i+j+1];
                res[i+j+1] = c%10;
                res[i+j] += c/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<m+n;i++){
            if (res[i]!=0 || !"".equals(sb.toString())){
                sb.append(res[i]);
            }
        }
        return sb.toString();
    }
}
