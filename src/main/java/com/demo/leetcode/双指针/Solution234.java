package com.demo.leetcode.双指针;

import com.demo.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution234 {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head,fast = head;

        ListNode leftNext = null,left = head;
        while (fast != null && fast.next != null){

            left = slow;

            slow = slow.next;
            fast = fast.next.next;

            left.next = leftNext;
            leftNext = left;

           
        }

        
        while (left != null && slow != null){
            if(left.val != slow.val){
                return false;
            }
            left = left.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        //[-10,-3,0,5,9]
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        System.out.println(isPalindrome(listNode));

    }
}