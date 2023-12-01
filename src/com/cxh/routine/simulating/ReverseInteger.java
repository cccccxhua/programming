package com.cxh.routine.simulating;

/**
 * @author CXH
 * @description
 * @create 2023-11-24 13:36
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }
    public static int reverse(int x){
        int res = 0;
        while (x!=0){
            //当为正数时，res*10 + x%10<Integer.MAX_VALUE 符合要求--> res<(max-x%10)/10
            if (x>0 && res > (Integer.MAX_VALUE-x%10)/10){
                return 0;
            }
            //当为负数时，res*10 + x%10>Integer.MIN_VALUE 符合要求--> res>(min-x%10)/10
            if (x<0 && res<(Integer.MIN_VALUE-x%10)/10){
                return 0;
            }
            //剩下的都符合要求
            res = res*10 + x%10;
            x = x/10;
        }
        return res;
    }

}
