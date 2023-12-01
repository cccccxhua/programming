package com.cxh.routine.simulating;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author CXH
 * @description
 * @create 2023-11-30 16:55
 */
public class PlusOne {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        int digit = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int n = digits.length;
        digits[n-1]++;
        for (int i=n-1;i>=0 || digit!=0 ;i--){
            int sum = i>=0?digits[i]+digit:digit;
            list.add(sum%10);
            digit = sum/10;
        }
        Collections.reverse(list);
        int[] res = new int[list.size()];
        for (int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
