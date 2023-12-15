package com.cxh.routine.programmer;

import java.util.Stack;

/**
 * @author CXH
 * @description
 * @create 2023-12-13 14:51
 */
public class DeleteAllAdjacentDuplicatesInString {
    public static void main(String[] args) {

    }
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (stack.isEmpty()){
                stack.push(ch);
            }else{
               if (stack.peek()==ch){
                   stack.pop();
               }else{
                   stack.push(ch);
               }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
