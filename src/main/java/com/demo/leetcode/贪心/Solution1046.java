package com.demo.leetcode.贪心;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution1046 {
    public int lastStoneWeight(int[] stones) {

        int len = stones.length;

        PriorityQueue<Integer> maxHeap = new PriorityQueue(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int i = 0; i< len; i++){
            maxHeap.add(stones[i]);
        }

        while (maxHeap.size() >= 2){
            Integer head1 = maxHeap.poll();
            Integer head2 = maxHeap.poll();

            maxHeap.offer(head1 - head2);
        }

        return maxHeap.poll();
        
    }

    public static void main(String[] args) {
        Solution1046 solution = new Solution1046();
        // int[] stones = {2, 7, 4, 1, 8, 1};
        int[] stones = {1, 3};
        int res = solution.lastStoneWeight(stones);
        System.out.println(res);


    }
}