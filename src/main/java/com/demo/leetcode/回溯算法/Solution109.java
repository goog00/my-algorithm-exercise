package com.demo.leetcode.回溯算法; /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution109 {
    public static TreeNode sortedListToBST(ListNode head) {

        // If the head doesn't exist, then the linked list is empty
        if (head == null) {
            return null;
        }

        ListNode mid  = findMiddleElement(head);

        //将中点作为 节点
        TreeNode node = new TreeNode(mid.val);

        // Base case when there is just one element in the linked list
        if (head == mid) {
            return node;
        }

        //左链递归
        node.left = sortedListToBST(head);
        //右链递归
        node.right = sortedListToBST(mid.next);

        return node;

    }

    private static ListNode findMiddleElement(ListNode head) {

        // The pointer used to disconnect the left half from the mid node.
        ListNode prevPtr = null;
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        // Iterate until fastPr doesn't reach the end of the linked list.
        while (fastPtr != null && fastPtr.next != null) {
            prevPtr = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // Handling the case when slowPtr was equal to head.
        if (prevPtr != null) {
            prevPtr.next = null;
        }

        return slowPtr;
    }



    public static void main(String[] args) {
        //[-10,-3,0,5,9]
        ListNode listNode = new ListNode(-10);
        ListNode listNode1 = new ListNode(-3);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        sortedListToBST(listNode);

    }
}