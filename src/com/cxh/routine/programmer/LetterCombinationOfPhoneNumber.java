package com.cxh.routine.programmer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-02-29 15:05
 */
public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationOfPhoneNumber letter = new LetterCombinationOfPhoneNumber();
        System.out.println(letter.letterCombinations("23"));
    }
    HashMap<Integer,char[]> map;
    public List<String> letterCombinations(String digits) {
        map = new HashMap<>();
        map.put(2, new char[]{'a','b','c'});
        map.put(3, new char[]{'d','e','f'});
        map.put(4, new char[]{'g','h','i'});
        map.put(5, new char[]{'j','k','l'});
        map.put(6, new char[]{'m','n','o'});
        map.put(7, new char[]{'p','q','r','s'});
        map.put(8, new char[]{'t','u','v'});
        map.put(9, new char[]{'w','x','y','z'});
        List<String> ans = new LinkedList<>();
        if (digits.length()==0){
            return ans;
        }
        backtracking(digits, 0, new StringBuilder(), ans);
        return ans;
    }
    public void backtracking(String digits,int idx,StringBuilder sb,List<String> ans){
        //每个数字都选了其一字母
        if (idx==digits.length()){
            ans.add(sb.toString());
            return;
        }
        char[] chs = map.get(digits.charAt(idx)-'0');
        for(int i=0;i<chs.length;i++){
            sb.append(chs[i]);
            backtracking(digits, idx+1, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
