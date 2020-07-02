package com.demo.leetcode.dp;

class Solution53 {
    public int maxSubArray(int[] nums) {
      
        
        int len = nums.length;
        if(nums == null || len == 0){
            return 0;
        }
        int max = nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0] ;
        for(int i = 1 ; i < len; i++){
            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;


    }
}