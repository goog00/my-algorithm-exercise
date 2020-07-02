package com.demo.leetcode;

class NumArray303 {

    private int[] dp ;
    public NumArray303(int[] nums) {
        int len = nums.length;
        dp = new int[len + 1];
        for(int i = 0; i < len; i++){
            dp[i + 1] = dp[i] + nums[i];
        }

    }
    
    public int sumRange(int i, int j) {
        return dp[j + 1] - dp[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */