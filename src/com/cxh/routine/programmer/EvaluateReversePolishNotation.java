package com.cxh.routine.programmer;

import java.util.Stack;
import java.util.function.ToLongBiFunction;

/**
 * @author CXH
 * @description
 * @create 2023-12-13 15:01
 */
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {

    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<tokens.length;i++){
            String s = tokens[i];
            if ("+".equals(s)){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b+a);
            }else if ("-".equals(s)){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if ("*".equals(s)){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b*a);
            }else if ("/".equals(s)){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
