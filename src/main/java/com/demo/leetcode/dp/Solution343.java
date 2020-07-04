package com.demo.leetcode.dp;

/**
 * @author steng
 * @description
 * @date 2020-07-04 4:37 下午
 **/
public class Solution343 {

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                //
//                dp[i] = max3(dp[i], j * dp[i - j], j * (i - j));
                dp[i] = Math.max(Math.max(dp[i],j * dp[i-j]),   j * (i-j) );
            }
        }
        return dp[n];
    }

    private int max3(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}
