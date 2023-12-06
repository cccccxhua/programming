package com.cxh.routine.programmer;

import com.sun.corba.se.spi.ior.iiop.IIOPFactories;

/**
 * @author CXH
 * @description
 * @create 2023-12-04 15:46
 */
public class BackspaceStringCompare {
    public static void main(String[] args) {

    }
    public boolean backspaceCompare(String s, String t) {
        int sp = s.length()-1;
        int tp = t.length()-1;
        int ss = 0;//记录要被删除的字符个数
        int tt = 0;//记录要被删除的字符个数
        while (sp>=0 || tp>=0){
            //先走到不会被删除的字符位置
            while (sp>=0){
                if (s.charAt(sp)=='#'){
                    //当前位置是退格
                    ss++;
                    sp--;
                }else if (ss>0){
                    //当前字符被删除
                    ss--;
                    sp--;
                }else{
                    break;
                }
            }
            while (tp>=0){
                if (t.charAt(tp)=='#'){
                    tt++;
                    tp--;
                }else if (tt>0){
                    tt--;
                    tp--;
                }else{
                    break;
                }
            }
            //此时指针都只在不会被删除的字符位置
            if (sp>=0 && tp>=0){
                if (s.charAt(sp)!=t.charAt(tp)){
                    return false;
                }
            }else if (sp>=0 || tp>=0){
                return false;
            }
            //相等 继续向前一位
            sp--;
            tp--;
        }
        return true;
    }

}
