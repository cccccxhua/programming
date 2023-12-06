package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-04 16:39
 */
public class SquareOfASortedArray {
    public static void main(String[] args) {

    }
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length-1;
        int idx = r;
        while (l<=r){
            if (nums[l]+nums[r]>=0){
                //说明右侧平方更大
                res[idx] = nums[r]*nums[r];
                r--;
            }else{
                res[idx] = nums[l]*nums[l];
                l++;
            }
            idx--;
        }
        return res;
    }
}
