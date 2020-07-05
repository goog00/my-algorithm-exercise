package com.demo.leetcode.贪心;

import java.util.Arrays;

class Solution1196 {
    public int maxNumberOfApples(int[] arr) {

        Arrays.sort(arr);
        int res = 0;
        int count =0;
        for(int i = 0; i < arr.length;i++){
            res+=arr[i];
            if(res <= 5000){
                count++;
            } else {
                break;
            }
            
        }
        return count;

    }
}