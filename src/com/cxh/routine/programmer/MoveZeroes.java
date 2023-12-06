package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-04 15:27
 */
public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        //不能改变相对顺序，所以只能快慢指针，头尾双指针改变了相对顺序
        int l = 0;
        int r = 0;
        while (r<nums.length){
            if (nums[l]==0 && nums[r]!=0){
                nums[l] = nums[r];
                nums[r] = 0;
                l++;
                r++;
            }else if (nums[l]==0 && nums[r]==0){
                r++;
            }else if (nums[r]==0){
                l = r;
                r++;
            }else{
                l++;
                r++;
            }

        }
    }
}
