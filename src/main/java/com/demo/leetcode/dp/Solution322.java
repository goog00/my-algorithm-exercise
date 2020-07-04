package com.demo.leetcode.dp;

import java.util.Arrays;

class Solution322 {

    public static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        // 注意：因为要比较的是最小值，这个不可能的值就得赋值成为一个最大值
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;
        //val表示面值;coin表示币值
        for(int val = 1; val <= amount; val++){
            for(int coin : coins){
                // 状态: dp[val]
                // 状态转移方程:dp[val] = min(dp[val],1+dp[val-coin])
                //dp[val]:面值val所需的最少硬币数
                //val - coin >= 0 : 硬币的面值要小于等于凑出来的面值
                //当前面值val = coin + pre-val; ==>当前面值是由币值加上前一个面值;
                //==> (dp[val - coin] + 1) 由于有不同的币值,so,根据当前面值能推出会有多个不同的前一个面值组成当前面值,
                // so,dp[val - coin]保存着不同的面值对应的所需的硬币数,(1 + dp[val - coin]) 表示构成当前面值所需的硬币数,
                // "1"表示由前一个面值所需的硬币数只有加1个硬币才是构成当前面值是最少构成当前面值的硬币数
                // Math.min(dp[val], 1 + dp[val - coin]) 取构成面值所需最少的硬币数

                if(val - coin >=0 && dp[val - coin] != amount + 1){
                    dp[val] = Math.min(dp[val], 1 + dp[val - coin]);
                }
            }
        }
        if (dp[amount] == amount + 1) {
            dp[amount] = -1;
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2};
        int amount = 3;
        System.out.println(coinChange(nums,amount));
    }
}