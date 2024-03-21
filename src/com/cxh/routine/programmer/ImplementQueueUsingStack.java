package com.cxh.routine.programmer;

import java.util.Stack;

/**
 * @author CXH
 * @description
 * @create 2024-03-04 13:59
 */
public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        ImplementQueueUsingStack q = new ImplementQueueUsingStack();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        q.push(5);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
    Stack<Integer> s1;
    Stack<Integer> s2;
    public ImplementQueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s1.isEmpty() && s2.isEmpty()){
            return -1;
        }
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s1.isEmpty() && s2.isEmpty()){
            return -1;
        }
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        if (s1.isEmpty() && s2.isEmpty()){
            return true;
        }
        return false;
    }
}
