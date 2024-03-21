package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-21 15:10
 */
public class FrequencyTracker {
    public static void main(String[] args) {
        FrequencyTracker f = new FrequencyTracker();
        f.deleteOne(1);

    }
    int[] nums;
    int[] fre;
    public FrequencyTracker() {
        nums = new int[100000];
        fre = new int[100000];
    }

    public void add(int number) {
        fre[nums[number]]--;
        nums[number]++;
        fre[nums[number]]++;
    }

    public void deleteOne(int number) {
        if (nums[number]==0){
            return;
        }
        fre[nums[number]]--;
        nums[number]--;
        fre[nums[number]]++;
    }

    public boolean hasFrequency(int frequency) {
        return fre[frequency]>0;
    }
}
