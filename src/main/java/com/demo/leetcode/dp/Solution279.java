package com.demo.leetcode.dp;

import java.util.Arrays;

class Solution279 {
    public static int numSquares(int n) {

        //记录
        int[] dp = new int[n + 1];
        //四平方定理： 任何一个正整数都可以表示成不超过四个整数的平方之和
        Arrays.fill(dp, 4);
        dp[0] = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1;j*j <= i; j++){
                dp[i] = Math.min(dp[i],dp[i - j*j] + 1);
            }
        }

        return dp[n];

    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }
}