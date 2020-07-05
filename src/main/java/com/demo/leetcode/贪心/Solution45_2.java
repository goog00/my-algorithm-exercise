package com.demo.leetcode.贪心;

/**
 * @author steng
 * @description
 * @date 2020-07-05 11:35 上午
 **/
public class Solution45_2 {

    public static int jump(int[] nums) {

        int rightMaxIndex = 0;
        int len = nums.length;
        //我们维护当前能够到达的最大下标位置，记为边界。我们从左到右遍历数组，到达边界时，更新边界并将跳跃次数增加 1。
        //ps: [2,3,1,2,4];
        //i=0--> rightMaxIndex = 2 --> i == end --> end = 2;
        //i=1 --> rightMaxIndex = 4 --> i != end --> end = 2;
        //i=2 --> rightMaxIndex = 3 --> i == end --> end = 4;
        //i=3 --> rightMaxIndex = 5 --> i == end --> end = 4;

        int end = 0;
        //跳跃的次数
        int step = 0;

        for(int i = 0; i  < len - 1; i++){
            //遍历每个元素,记录跳的最远的索引
            rightMaxIndex = Math.max(rightMaxIndex, i + nums[i]);
            if(i == end){
                end = rightMaxIndex;
                step++;
            }
        }

        return step;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2,4};
        int k = jump(nums);
        System.out.println(k);
    }
}
