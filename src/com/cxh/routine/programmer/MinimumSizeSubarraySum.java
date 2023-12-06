package com.cxh.routine.programmer;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.Arrays;

/**
 * @author CXH
 * @description
 * @create 2023-12-04 16:57
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        //连续子数组
        int[] preSum = new int[nums.length];
        int res = Integer.MAX_VALUE;
        if (nums[0]>=target){
            return 1;
        }
        int sum = 0;
        int start = 0;
        int end = 0;
        while (end<nums.length){
            if (sum>=target){
                if (res>end-start){
                    res = end-start;
                }
                sum-=nums[start];
                start++;
                continue;
            }
            sum+=nums[end];
            end++;
        }
        while (sum>=target){
            if (res>end-start){
                res = end-start;
            }
            sum-=nums[start];
            start++;
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
