package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-13 10:02
 */
public class ReverseStringⅡ {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefghi", 2));
    }
    public static String reverseStr(String s, int k) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int len = n;
        int l = 0;
        while (len>0){
            //长度小于k，全部反转
            if (len<k){
                return reverse(chars, l, n-1);
            }
            //长度大于k，小于2k，反转前K个
            if (len<2*k){
                return reverse(chars,l,l+k-1);
            }
            //长度大于2k
            reverse(chars,l,l+k-1);
            l = l+k*2;
            len = len-2*k;
        }
        return String.valueOf(chars);
    }
    public static String reverse(char[] s,int l,int r){
        while (l<r){
            s[l] ^= s[r];  //构造 a ^ b 的结果，并放在 a 中
            s[r] ^= s[l];  //将 a ^ b 这一结果再 ^ b ，存入b中，此时 b = a, a = a ^ b
            s[l] ^= s[r];  //a ^ b 的结果再 ^ a ，存入 a 中，此时 b = a, a = b 完成交换
            l++;
            r--;
        }
        return String.valueOf(s);
    }
}
