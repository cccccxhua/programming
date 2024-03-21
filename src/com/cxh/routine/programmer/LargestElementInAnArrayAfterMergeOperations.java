package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-15 10:12
 */
public class LargestElementInAnArrayAfterMergeOperations {
    public static void main(String[] args) {

    }
    public long maxArrayValue(int[] nums) {
        //[2,3,7,9,3]
        //要保护nums[i]<=nums[i+1]才会变大
        long sum = nums[nums.length-1];
        for (int i=nums.length-2;i>=0;i--){
            if (nums[i]<=sum){
                sum = nums[i] + sum;
            }else{
                sum = nums[i];
            }
        }
        return sum;
    }
}
