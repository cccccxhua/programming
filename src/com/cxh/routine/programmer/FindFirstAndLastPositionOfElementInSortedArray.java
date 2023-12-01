package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-01 15:27
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{ 5,7,7,8,8,10}, 8));
    }
    public static int[] searchRange(int[] nums, int target) {
        int leftPosition = findLeftPosition(nums, target);
        int rightPosition = findRightPosition(nums, target);
        if (leftPosition==-1 || rightPosition == -1){
            return new int[]{-1,-1};
        }
        if (leftPosition>rightPosition){
            return new int[]{-1,-1};
        }
        return new int[]{leftPosition,rightPosition};
    }
    public static int findLeftPosition(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        int leftBorder = -1;
        while (left<right){
            int mid = left + ((right - left)>>1);
            //找到最左侧的target
            if (nums[mid]>=target){
                right = mid;
                leftBorder = right;
            }else if (nums[mid]<target){
                left = mid +1;
            }
        }
        return leftBorder;
    }
    public static int findRightPosition(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        int rightBorder = -1;
        while (left<right){
            int mid = left + ((right - left)>>1);
            //找到最右侧的target
            if (nums[mid]>target){
                right = mid;
            }else if (nums[mid]<=target){
                left = mid +1;
                rightBorder = left;
            }
        }
        return rightBorder-1;
    }
}
