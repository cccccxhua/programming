package com.cxh.routine.programmer;

import com.cxh.utils.ListNode;

import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-12-06 11:09
 */
public class RemoveLinkedListElement {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        if (head==null){
            return null;
        }
        ListNode res = new ListNode(-1, head);
        ListNode pre = res;
        ListNode cur = head;
        while (cur!=null){
            if (cur.val==val){
                pre.next = cur.next;
            }else{
                pre = pre.next;
            }
            cur = cur.next;
        }
        return res.next;
    }
}
