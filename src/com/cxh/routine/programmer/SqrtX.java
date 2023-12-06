package com.cxh.routine.programmer;

import com.sun.corba.se.spi.logging.LogWrapperFactory;

/**
 * @author CXH
 * @description
 * @create 2023-12-04 10:19
 */
public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        int left = 0;
        int right = x/2;
        int res = -1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if ((long)mid*mid<=x){
                left = mid+1;
                res = mid;
            }else{
                right = mid-1;
            }
        }
        return res;
    }
}
