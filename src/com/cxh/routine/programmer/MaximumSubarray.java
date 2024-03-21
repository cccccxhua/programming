package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-20 14:35
 */
public class MaximumSubarray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
            if (sum>max){
                max = sum;
            }
            if (sum<0){
                sum = 0;

            }
        }
        return max;
    }
}
