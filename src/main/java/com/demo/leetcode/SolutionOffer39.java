package com.demo.leetcode;

class SolutionOffer39 {
    //如果x是众数,即x的个数超过数组的长度的一半,那么使用计数消除的方法x的个数肯定比非众数最少多1个;
    //
    public int majorityElement(int[] nums) {
        int x = 0 , vote = 0 ;
        for(int num : nums){
            if(vote == 0) {
                x = num;
            }
            vote += x == num ? 1 : -1;
        }
        return x;
    }
}