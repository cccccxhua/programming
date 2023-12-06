package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-04 10:50
 */
public class ValidPerfectSquare {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        while (l<=r){
            int mid = l + (r-l)/2;
            if ((long)mid*mid<num){
                l = mid +1;
            }else if ((long)mid*mid>num){
                r = mid -1;
            }else{
                return true;
            }
        }
        return false;
    }
}
