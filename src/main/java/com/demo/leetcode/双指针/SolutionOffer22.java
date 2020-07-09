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
class SolutionOffer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
            int length = 0;
            ListNode tmp = head;

            while(tmp != null){
                length ++;
                tmp = tmp.next;
            }
           // System.out.println(length);
            int index = 0;
            while(head != null){
                
                //System.out.println(index);
                if(length - k == index){

                    return head;
                }
                index++;
                head = head.next;
            }
            return null;
    }
}