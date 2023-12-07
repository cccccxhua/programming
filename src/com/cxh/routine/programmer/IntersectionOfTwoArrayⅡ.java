package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author CXH
 * @description
 * @create 2023-12-07 16:19
 */
public class IntersectionOfTwoArrayⅡ {
    public static void main(String[] args) {
        System.out.println(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for (int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map1.entrySet()){
            int key = entry.getKey();
            if (map2.containsKey(key)){
                int cnt = Math.min(map1.get(key), map2.get(key));
                int value = map1.get(key);
                for (int i=0;i<cnt;i++){
                    res.add(key);
                }
            }
        }
        int[] ans = new int[res.size()];
        for (int i=0;i<ans.length;i++){
            ans[i] = res.get(i);
        }
        return ans;

    }
}
