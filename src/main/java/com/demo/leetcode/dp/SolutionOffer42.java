package com.demo.leetcode.dp;

/**
 * @author steng
 * @description
 * @date 2020-07-01 5:52 下午
 **/
public class SolutionOffer42 {

    //时间复杂度:O(N)
    //空间复杂度:O(1)

    public static int maxSubArray(int[] nums) {
        int res = nums[0];//dp
        for (int i = 1; i < nums.length; i++) {
            if(nums[i - 1] > 0){
                nums[i] = nums[i] + nums[i - 1];
            } else {
                nums[i] = nums[i];
            }

            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,-1};
        int k = maxSubArray(nums);
        System.out.println(k);
    }

}
