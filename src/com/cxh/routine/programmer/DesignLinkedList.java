package com.cxh.routine.programmer;

import com.cxh.utils.ListNode;

/**
 * @author CXH
 * @description
 * @create 2023-12-06 11:24
 */
public class DesignLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode nextNode = head.next;
        ListNode pre = head;
        pre.next = null;
        while (nextNode!=null){
            ListNode tmp = nextNode.next;
            nextNode.next = pre;
            pre = nextNode;
            nextNode = tmp;
        }
        return pre;
    }
}
