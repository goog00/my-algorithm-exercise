package com.demo.leetcode.贪心;

/**
 * @author steng
 * @description
 * @date 2020-07-04 7:19 下午
 **/
public class Solution122 {

    public int maxProfit(int[] prices) {

        int res = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (diff > 0) {
                res += diff;
            }
        }
        return res;

    }
}
