package com.cxh.routine.programmer;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author CXH
 * @description
 * @create 2023-12-13 15:12
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        System.out.println(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        //维护一个最大值，一个次大值
        Deque<Integer> queue = new LinkedList<>();
        for (int i=0;i<nums.length;i++){
            if (i>=k && queue.peekFirst()==nums[i-k]){
                queue.pollFirst();
            }
            while (!queue.isEmpty() && queue.peekFirst()<nums[i]){
                queue.pollFirst();
            }
            while (!queue.isEmpty() && queue.peekLast()<nums[i]){
                queue.pollLast();
            }
            if (queue.isEmpty()){
                queue.offerFirst(nums[i]);
            }else{
                queue.offerLast(nums[i]);
            }
            if (i>=k-1){
                ans[i-k+1] = queue.peekFirst();
            }

        }
        return ans;
    }
}
