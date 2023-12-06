package com.cxh.routine.programmer;

import com.cxh.utils.ListNode;

import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-12-06 15:50
 */
public class LinkedListCircleⅡ {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(3);
        ListNode t2 = new ListNode(1);
        ListNode t3 = new ListNode(2);
        ListNode t4 = new ListNode(-4);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t2;
        System.out.println(detectCycle(t1));
    }
    public static ListNode detectCycle(ListNode head) {
        if (head==null || head.next==null){
            return null;
        }
        ListNode low = head;
        ListNode fast = head.next;
        while (fast!=null){
            if (low==fast){
                ListNode res = head;
                low = low.next;
                while (low!=res){
                    low = low.next;
                    res = res.next;
                }
                return res;
            }
            if (fast.next==null){
                return null;
            }
            fast = fast.next.next;
            low = low.next;
        }
        return null;
    }
}
