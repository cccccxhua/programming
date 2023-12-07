package com.cxh.routine.programmer;

import java.util.HashSet;

/**
 * @author CXH
 * @description
 * @create 2023-12-07 16:53
 */
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n!=1){
            set.add(n);
            int sum = 0;
            while (n!=0){
                sum+=((n%10)*(n%10));
                n = n/10;
            }
            n = sum;
            if (set.contains(n)){
                return false;
            }

        }
        return true;
    }
}
