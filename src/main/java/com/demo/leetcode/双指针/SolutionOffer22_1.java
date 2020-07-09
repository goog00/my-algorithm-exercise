package com.demo.leetcode.双指针;

import com.demo.leetcode.ListNode;

/**
 * 双指针
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SolutionOffer22_1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
           ListNode slow = head;
           ListNode fast = head;

           for(int i = 0;i < k; i++){
               fast = fast.next;
           }

           while(fast != null){
               fast = fast.next;
               slow = slow.next;
           }
           return slow;
    }
}