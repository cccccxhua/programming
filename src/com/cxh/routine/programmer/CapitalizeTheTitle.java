package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-12 10:14
 */
public class CapitalizeTheTitle {
    public static void main(String[] args) {

    }
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] s = title.split(" ");
        for (int i=0;i<s.length;i++){
            if (s[i].length()<=2){
                sb.append(s[i].toLowerCase());
            }else{
                sb.append(s[i].substring(0, 1).toUpperCase());
                sb.append(s[i].substring(1,s[i].length()).toLowerCase());
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

}
