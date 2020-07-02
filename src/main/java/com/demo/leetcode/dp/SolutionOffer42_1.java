package com.demo.leetcode.dp;

class SolutionOffer42_1 {

    //时间复杂度:O(N)
    //空间复杂度:O(n)
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        //dp状态列表
        //
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int k = maxSubArray(nums);
        System.out.println(k);
    }
}
