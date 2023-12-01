package com.cxh.routine.simulating;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2023-11-23 10:53
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int[] result = twoSum1(nums, 6);
        System.out.println(result[0]+","+result[1]);
    }
    //暴力 时间O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            int one = nums[i];
            int two = target-one;
            for (int j=0;j<nums.length;j++){
                if (i!=j && nums[j]==two){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    //哈希表
    public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{i,map.get(nums[i])};
            }else{
                map.put(nums[i],i);
            }

        }
        return null;
    }
}
