package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-01 10:53
 */
public class BinarySearch {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left<right){
            int tmp = left + (right-left)/2;
            if (nums[tmp]>target){
                right = tmp;
            }else if (nums[tmp]<target){
                left = tmp+1;
            }else{
                return tmp;
            }
        }
        return -1;
    }
}
