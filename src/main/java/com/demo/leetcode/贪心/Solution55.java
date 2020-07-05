package com.demo.leetcode.贪心;

class Solution55 {
    public static boolean canJump(int[] nums) {

        int len = nums.length;
        //最远可跳跃的位置
        int rightMaxIndex = 0;

        for(int i = 0;i< len; i++){
            if(i <= rightMaxIndex){
                rightMaxIndex = Math.max(rightMaxIndex,i + nums[i]);
                if(rightMaxIndex >= len - 1){
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{ 2,5,0,0};
        boolean k = canJump(nums);
        System.out.println(k);

    }
}