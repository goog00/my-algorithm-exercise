package com.demo.leetcode;

/**
 *
 *
 * @author steng
 * @description
 * @date 2020-07-01 5:07 下午
 **/
public class Solution7 {


    /**
     * 时间复杂度: O(log(x)), x 中大约有log10(x) 位数字
     * 空间复杂度：O(1)
     * ​
     * @param x
     * @return
     */

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            //从低位到高位循环获取x每一位的值
            int pop = x % 10;
            //x除10,去掉最后一位数
            x /= 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)){
                return 0;
            }
            //组装成反转的数组
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

}


