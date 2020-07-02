package com.demo.leetcode.dp;

/**
 * 9 回文数
 * @author steng
 * @description
 * @date 2020-07-01 12:27 上午
 **/
public class Solution9 {
    public boolean isPalindrome(int x) {

        //小于0 情况不满足
        // 最后一位是0的情况,也不满足,因为最高位不能为0
        //0满足要求
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertNum = 0;
        while (x > revertNum) {
            //x%10  对x除10取余获取x的最后一位数字
            //x/10  对x去除最后一位数字

            revertNum = revertNum * 10 + x % 10;
            x /= 10;
        }
        //当x的长度为奇数时,revertNum/10去除中位数
        return x == revertNum || x == revertNum / 10;


    }
}
