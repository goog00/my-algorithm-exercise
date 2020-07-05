package com.demo.leetcode.贪心;

/**
 * 时间:O(n2)
 * 空间:O(1)
 */
class Solution45_1 {
    //反向位置查找
    //1.先找到达到最后一个位置的index最小的index,然后把这个index当做新数组的最后的位置,重复此操作,记录次数
    public int jump(int[] nums) {

        int position = nums.length -1;
        int step = 0;

        while(position > 0){
            for(int i = 0; i < position; i++){
                if(i + nums[i] >= position){
                    position = i;
                    step++;
                    break;

                }
            }
        }
        return step;

    }
}