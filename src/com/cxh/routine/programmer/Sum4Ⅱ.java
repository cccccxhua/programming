package com.cxh.routine.programmer;

import jdk.nashorn.internal.objects.NativeNumber;

import java.util.HashMap;

/**
 * @author CXH
 * @description
 * @create 2023-12-08 13:56
 */
public class Sum4Ⅱ {
    public static void main(String[] args) {

    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        int n = nums1.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                map.put(nums1[i]+nums2[j],map.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (map.containsKey(-(nums3[i]+nums4[j]))){
                    res+=map.get(-(nums3[i]+nums4[j]));
                }
            }
        }
        return res;
    }
}
