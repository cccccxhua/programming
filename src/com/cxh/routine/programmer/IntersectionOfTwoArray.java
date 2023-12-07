package com.cxh.routine.programmer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-12-07 16:03
 */
public class IntersectionOfTwoArray {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new LinkedList<>();
        for (int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++){
            if (set.contains(nums2[i])){
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] ans = new int[res.size()];
        for (int i=0;i<ans.length;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
