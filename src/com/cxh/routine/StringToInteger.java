package com.cxh.routine;

/**
 * @author CXH
 * @description
 * @create 2023-11-24 13:55
 */
public class StringToInteger {
    /*
    Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
     */
    public static void main(String[] args) {
        System.out.println(myAtoi("0000+85"));
    }
    public static int myAtoi(String s){
        s = s.trim();//去除前导空格
        Boolean sign = true;//记录符号位，默认为正数
        int flag = 0;//记录符号出现次数，出现多次符号后不纳入计算
        int res = 0;
        for (int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            //判断是否为符号
            if (cur=='-' || cur =='+'){
                if (i!=0){
                    return res;
                }
                if (flag==1){
                    return res;
                }
                if (cur=='-'){
                    sign = false;
                }
                flag=1;
                continue;
            }
            if (res>0 && !sign){
                res = -res;
            }
            //判断是不是非数字
            if (cur<48 || cur>57){
                return res;
            }
            int tmp = Integer.parseInt(cur + "");
            if (sign){
                //res超出右界时，sign应为正数
                if (res>(Integer.MAX_VALUE-tmp)/10){
                    return Integer.MAX_VALUE;
                }
                res = res*10+tmp;
            }else{
                //res超出左界，sign为负数

                if (res<(Integer.MIN_VALUE+tmp)/10){
                    return Integer.MIN_VALUE;
                }
                res = res*10-tmp;
            }
        }

        return res;
    }
}
