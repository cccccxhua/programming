package com.cxh.routine.programmer;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

/**
 * @author CXH
 * @description
 * @create 2023-12-01 11:01
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5}, 4));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left<right){
            int mid = left + ((right-left)>>1);
            if (nums[mid] > target){
                right = mid;
            }else if (nums[mid] < target){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return right;
    }
}
