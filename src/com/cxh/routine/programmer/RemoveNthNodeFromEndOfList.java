package com.cxh.routine.programmer;

import com.cxh.utils.ListNode;

/**
 * @author CXH
 * @description
 * @create 2023-12-06 14:33
 */
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(new ListNode(1,new ListNode(2)), 2));
    }
    /*public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null){
            return null;
        }
        int len = 0;
        ListNode dummy = new ListNode(-1,head);
        ListNode cur = head;
        while (cur!=null){
            len++;
            cur = cur.next;
        }
        cur = dummy;
        int idx = len - n;
        while (idx>0){
            cur = cur.next;
            idx--;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }*/
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //一遍扫描，通过两个指针间隔n，得到倒数第n个位置的前一个位置
        ListNode dummy = new ListNode(-1,head);
        ListNode low = dummy;
        ListNode fast = dummy;
        while (n>0){
            fast = fast.next;
            n--;
        }
        while (fast.next!=null){
            low = low.next;
            fast = fast.next;
        }
        low.next = low.next.next;
        return dummy.next;
    }
}
