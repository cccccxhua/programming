package com.cxh.routine;

import com.cxh.utils.ListNode;
import jdk.nashorn.internal.ir.ReturnNode;

import java.util.LinkedList;

/**
 * @author CXH
 * @description
 * @create 2023-11-23 11:26
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9))))))))));
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }
    //首先能够将两个数转换成整数，然后相加，然后创建链表
    //但是此题链表长度为100,转换成数后装不下
    //所以考虑先反转链表，然后在逐位相加生成新的链表
    //最后将新链表反转即可
    //但是反转链表需要用到双向链表
    //故此按照加法从最后一位相加，进位即可
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode res = node;
        int digit = 0;
        while(l1!=null && l2!=null){
            int tmp = l1.val + l2.val + digit;
            if (tmp>=10){
                digit = tmp/10;
                tmp = tmp%10;
            }else{
                digit = 0;
            }
            node.next = new ListNode(tmp);
            node = node.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1!=null){
            int tmp = l1.val + digit;
            if (tmp>=10){
                digit = tmp/10;
                tmp = tmp%10;
            }else{
                digit = 0;
            }
            node.next = new ListNode(tmp);
            node = node.next;
            l1 = l1.next;
        }
        while (l2!=null){
            int tmp = l2.val + digit;
            if (tmp>=10){
                digit = tmp/10;
                tmp = tmp%10;
            }else{
                digit = 0;
            }
            node.next = new ListNode(tmp);
            node = node.next;
            l2 = l2.next;
        }
        if (digit!=0){
            node.next = new ListNode(digit);
        }
        return res.next;
    }

}
