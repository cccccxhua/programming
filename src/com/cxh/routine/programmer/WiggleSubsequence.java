package com.cxh.routine.programmer;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-03-19 14:07
 */
public class WiggleSubsequence {
    public static void main(String[] args) {
        WiggleSubsequence w = new WiggleSubsequence();
        System.out.println(w.wiggleMaxLength(new int[]{3,3,3,2,5}));

    }
    public int wiggleMaxLength(int[] nums) {
        if (nums.length<=1){
            return nums.length;
        }
       int pre = 0;
       int cur = 0;
       int ans = 1;
       for (int i=0;i<nums.length-1;i++){
           cur = nums[i+1]-nums[i];
           if ((cur>0 && pre<=0)||(cur<0&&pre>=0)){
               pre = cur;
               ans++;
           }
       }
       return ans;
    }


}
