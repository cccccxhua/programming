package com.cxh.routine.programmer;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.awt.image.GifImageDecoder;

/**
 * @author CXH
 * @description
 * @create 2024-03-07 11:09
 */
public class FindTheDivisibilityArrayOfAString {
    public static void main(String[] args) {
        FindTheDivisibilityArrayOfAString f = new FindTheDivisibilityArrayOfAString();
        System.out.println(f.divisibilityArray("1010", 10));
    }
    public int[] divisibilityArray(String word, int m) {
        /*
        每次记录前一个数除以m后剩下的余数，然后再与后一个数组成两位数除以m
        例:998244353
        9%3 = 0;余数0
        09%3 = 0;余数0
        08%3 = 2;余数2
        22%3 = 1;余数1
        14%3 = 2;余数2
        24%3 = 0;余数0
        03%3 = 0;余数0
        05%3 = 2;余数2
        23%3 = 2;余数2
        有余数的为0，无余数的为1
        得到结果[1,1,0,0,0,1,1,0,0]
         */
        long digit = 0l;
        int[] ans = new int[word.length()];
        for (int i=0;i<word.length();i++){
            int num = word.charAt(i) - '0';
            digit = (digit*10 + num)%m;
            if (digit == 0){
                ans[i] = 1;
            }else {
                ans[i] = 0;
            }
        }
        return ans;
    }

}
