package com.cxh.routine.programmer;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2023-12-08 14:07
 */
public class Sum3 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            if (nums[i]>=0){
                //排序了，第一个数大于等于0就不会有符合条件的结果
                return ans;
            }
            if (i>0 && nums[i]==nums[i-1]){
                //去重
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                if (nums[j]+nums[k]+nums[i]>0){
                    k--;
                }else if (nums[j]+nums[k]+nums[i]<0){
                    j++;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    while (j<k && nums[j+1]==nums[j]){
                        j++;
                    }
                    while (j<k && nums[k-1]==nums[k]){
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}
