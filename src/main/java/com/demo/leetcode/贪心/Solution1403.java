package com.demo.leetcode.贪心;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum+=nums[i];
        }
        int res = 0;    
        List<Integer> tmp = new ArrayList<Integer>();
        for(int i = len - 1 ; i >= 0; i--){
            res += nums[i];
            if(res > (sum - res)){
                //第一次大于剩余其他子序列时,跳出
                tmp.add(nums[i]);
                break;
            } else {
                tmp.add(nums[i]);
            }
        }
        
      
        return tmp;

    }
}