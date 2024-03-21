package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-06 9:41
 */
public class FindTheKOrOfAArray {
    public static void main(String[] args) {
        FindTheKOrOfAArray f = new FindTheKOrOfAArray();
        System.out.println(f.findKOr(new int[]{7, 12, 9, 8, 9, 15}, 4));
    }
    public int findKOr(int[] nums, int k) {
        int ans = 0;
        for (int i=0;i<31;i++){
            int cnt = 0;
            for (int j=0;j<nums.length;j++){
                int tmp = (int) Math.pow(2, i);
                if (tmp==(tmp & nums[j])){
                    cnt++;
                }
            }
            if (cnt>=k){
                ans+=Math.pow(2, i);
            }
        }
        return ans;
    }
}
