package com.demo.leetcode.贪心;

class Solution1221 {
    public int balancedStringSplit(String s) {

        //标记法
        char[] balance = s.toCharArray();
        int R = 0;
        int N = 0;
        for(int i = 0; i < balance.length; i++){
            if(balance[i] == 'R'){
                R++;
            } else if(balance[i] == 'L'){
                R--;
            }
            if(R == 0){
                N++;
            }
        }
        return N;

    }
}