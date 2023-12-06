package com.cxh.routine.programmer;

import com.cxh.utils.ListNode;

/**
 * @author CXH
 * @description
 * @create 2023-12-06 15:34
 */
public class IntersectionOfTwoLinkedListsLCCI {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null){
            return null;
        }
        ListNode aCur = headA;
        ListNode bCur = headB;
        while (true){
            if (aCur==bCur){
                return aCur;
            }
            if (aCur.next==null && bCur.next==null){
                return null;
            }
            if (aCur.next!=null){
                aCur = aCur.next;
            }else{
                aCur =headB;
            }
            if (bCur.next!=null){
                bCur = bCur.next;
            }else {
                bCur = headA;
            }
        }
    }
}
