package com.demo.leetcode.双指针;

class Solution167_1 {
    //暴力遍历
    //时间:O(n的平方)
    //空间:O(1)
    public int[] twoSum(int[] numbers, int target) {

        for(int i = 0; i< numbers.length; i++){
            for(int j = i+1; j< numbers.length; j++){
                    if(numbers[i] + numbers[j] == target){
                        return new int[]{i+1,j+1};
                    }
            }
        }
        return null;
    }
}