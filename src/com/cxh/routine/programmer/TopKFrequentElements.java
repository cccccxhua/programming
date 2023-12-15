package com.cxh.routine.programmer;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2023-12-14 10:55
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            queue.offer(new int[]{entry.getKey(),entry.getValue()});
        }

        int[] ans = new int[k];
        for (int i=0;i<k;i++){
            ans[i] = queue.poll()[0];
        }
        return ans;
    }
}
