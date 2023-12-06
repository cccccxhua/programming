package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-04 14:21
 */
public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 2));
    }
    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            if (nums[start] == val){
                if (nums[end]!=val){
                    int tmp = nums[end];
                    nums[end] = nums[start];
                    nums[start] = tmp;
                    start++;
                    end--;
                }else {
                    end--;
                }
            }else{
                start++;
            }
        }
        return start;
    }
}
