package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2023-12-07 11:08
 */
public class Ransom {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[26];
        for (int i=0;i<magazine.length();i++){
            cnt[magazine.charAt(i)-'a']++;
        }
        for (int i=0;i<ransomNote.length();i++){
            cnt[ransomNote.charAt(i)-'a']--;
            if (cnt[ransomNote.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}
