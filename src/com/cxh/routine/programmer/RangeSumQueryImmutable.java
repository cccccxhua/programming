package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-18 11:41
 */
public class RangeSumQueryImmutable {
    public static void main(String[] args) {

    }
    int[] preSum = null;
    public RangeSumQueryImmutable(int[] nums) {
        preSum = new int[nums.length];
        preSum[0] = nums[0];
        for (int i=1;i<nums.length;i++){
            preSum[i] = preSum[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left==0){
            return preSum[right];
        }else{
            return preSum[right] - preSum[left-1];
        }
    }
}
