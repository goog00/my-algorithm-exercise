package com.demo.leetcode.堆;

import java.util.PriorityQueue;
//leetcode编号 703 数据流中第K大元素
class KthLargest {
    //优先级队列,容量为k,所以队首元素为最小元素,也就是第k大元素
    final PriorityQueue<Integer> q;
    final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue(k);

        for(int i : nums){
            add(i);
        }

    }

    public int add(int val) {
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
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
