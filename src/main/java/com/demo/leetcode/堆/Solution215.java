package com.demo.leetcode.堆;

import java.util.PriorityQueue;

class Solution215 {
  

    static PriorityQueue<Integer> q ;
    public static int findKthLargest(int[] nums,int k) {
        //优先级队列,容量为k,所以队首元素为最小元素,也就是第k大元素
        q = new PriorityQueue(k);
        int ans = 0;
        for(int i : nums){
           ans = add(i,k);
        }
        return ans;

    }

    public static int add(int val,int k) {
        //如果队列大小小于k,则添加元素
        if(q.size() < k){
            q.offer(val);
        }
        else if(q.peek() < val){
            //删除队首元素
            q.poll();
            q.offer(val);
        }
        //取出队首元素,但不删元素
        return q.peek();

    }

    public static void main(String[] args) {
        //[3,2,1,5,6,4]
        int[] ar = new int[]{3,2,1,5,6,4};
        int kk = findKthLargest(ar,2);
        System.out.println(kk);

    }
}