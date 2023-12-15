package com.cxh.routine.programmer;

import jdk.internal.org.objectweb.asm.tree.LineNumberNode;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-12-08 14:51
 */
public class Sum4 {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{2, 2, 2, 2, 2}, 8));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<nums.length-3;i++) {
            if (i>0 && nums[i]==nums[i-1]){
                //剪枝去重
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    //剪枝去重
                    continue;
                }
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if ((long)(nums[i] + nums[j] + nums[l] + nums[r]) < (long) target) {
                        l++;
                    } else if ((long)(nums[i] + nums[j] + nums[l] + nums[r]) > (long)target) {
                        r--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        ans.add(list);
                        while (l < r && nums[l] == nums[l + 1]) {
                            //剪枝去重
                            l++;
                        }
                        while (l < r && nums[r - 1] == nums[r]) {
                            //剪枝去重
                            r--;
                        }
                        l++;
                        r--;
                    }

                }
            }
        }
        return ans;
    }

}
