package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-04 14:46
 */
public class RemoveDuolicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }
    public static int removeDuplicates(int[] nums) {
        int fast = 0;
        int low = 0;
        while (fast<nums.length){
            if (nums[low]!=nums[fast]){
                low++;
                nums[low] = nums[fast];
            }
            fast++;
        }
        return low+1;
    }
}
