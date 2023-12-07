package com.cxh.routine.programmer;

import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2023-12-07 11:13
 */
public class GroupAnagrams {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        //通过排序来解决map key值不同的问题
        //异位词排序后，就是同一个Key了
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> item:map.values()){
            res.add(item);
        }
        return res;
    }
}
