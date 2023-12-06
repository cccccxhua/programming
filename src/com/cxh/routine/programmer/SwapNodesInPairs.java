package com.cxh.routine.programmer;

import com.cxh.utils.ListNode;

import java.util.Dictionary;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-12-06 14:06
 */
public class SwapNodesInPairs {
    public static void main(String[] args) {
        System.out.println(swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
    }
    public static ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode first = head;
        ListNode second = head.next;
        ListNode cur = dummy;
        while (true){
            ListNode tmp = second.next;
            cur.next = second;
            second.next = first;
            first.next = tmp;
            cur = first;
            first = cur.next;
            if (first==null){
                return dummy.next;
            }
            second = first.next;
            if (second == null){
                return dummy.next;
            }
        }
    }
}
