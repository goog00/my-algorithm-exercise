package com.demo.leetcode.dp;

class Solution746 {
    public static int minCostClimbingStairs(int[] cost) {

        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = Math.min(cost[0],cost[1]);

        for(int i = 2; i < len; i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return dp[len - 1] > dp[len-2] ? dp[len - 2] : dp[len - 1] ;

    }

    public static void main(String[] args) {
        int[] cost = new int[]{0,1,1,0};
        int k = minCostClimbingStairs(cost);
        System.out.println(k);
    }
}