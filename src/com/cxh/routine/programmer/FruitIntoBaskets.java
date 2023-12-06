package com.cxh.routine.programmer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author CXH
 * @description
 * @create 2023-12-05 14:08
 */
public class FruitIntoBaskets {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1,0,1,4,1,4,1,2,3}));
    }
    public static int totalFruit(int[] fruits) {
        //找到最长的两个相同数字的最长连续子数组
        //滑动窗口
        //当end所在树的type是可以采摘的type时，如两个篮子并没有全装or该树的type属于其中一个篮子，end++
        //当end所在树不能采摘时，start++
        int start = 0;
        int end = 0;
        int res = 0;
        HashMap<Integer, Integer> baskets = new HashMap<Integer,Integer>();
        while (end<fruits.length){
            baskets.put(fruits[end],baskets.getOrDefault(fruits[end],0)+1);
            while (baskets.size()>2){
                baskets.put(fruits[start],baskets.get(fruits[start])-1);
                if (baskets.get(fruits[start])==0){
                    baskets.remove(fruits[start]);
                }
                start++;
            }
            res = Math.max(res, end-start+1);
            end++;
        }
        return res;
    }
}
