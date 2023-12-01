package com.cxh.routine.simulating;

/**
 * @author CXH
 * @description
 * @create 2023-11-23 15:14
 */
public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert1("PAYPALISHIRING", 3));
    }
    public static String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        char[][] grid = new char[numRows][s.length()];
        int index = 0;
        int i = 0;
        int j = 0;
        while (index<s.length()){
            while (index<s.length() && i<numRows){
                grid[i][j] = s.charAt(index);
                i++;
                index++;
            }
            if (i==numRows){
                i-=2;
                j++;
            }
            while (index<s.length() && i>=0 && j<s.length()){
                grid[i][j]  = s.charAt(index);
                i--;
                j++;
                index++;
            }
            if (i<0){
                i+=2;
                j--;
            }
        }
        String res = "";
        for (i=0;i<numRows;i++){
            for (j=0;j<s.length();j++){
                //判断char型变量 空字符
                if (grid[i][j]!='\0'){
                    res+=grid[i][j];
                }
            }
        }
        return res;
    }
    public static String convert1(String s, int r) {
        int n = s.length();
        if (n == 1 || r == 1) return s;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            if (i == 0 || i == r - 1) {
                int j = i;
                int rowOffset = (r - 1) * 2 - 1;
                while (j < n) {
                    sb.append(s.charAt(j));
                    j += rowOffset + 1;
                }
            } else {
                int j = i;

                int topRow = i;
                int topOffset = topRow * 2 - 1;

                int bottomRow = r - i - 1;
                int bottomOffset = bottomRow * 2 - 1;

                boolean flag = true;
                while (j < n) {
                    sb.append(s.charAt(j));
                    j += flag ? bottomOffset + 1 : topOffset + 1;
                    flag = !flag;
                }
            }
        }
        return sb.toString();
    }

}
