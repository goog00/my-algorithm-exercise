package com.demo.leetcode.贪心;

import java.util.Arrays;

class Solution1005 {
    public static int largestSumAfterKNegations(int[] A, int K) {

        Arrays.sort(A);
        int len = A.length;

        int res = 0;

        for(int i = 0; i < len; i++){

            if(A[i] < 0 && K > 0){
                //1.只要是负数就把它转正
                A[i] = -A[i];
                K--;
            } else if(A[i] < 0 && K == 0){
                //2. K == 0说明已经转了K次,不做任何操作,只统计累加和
                break;
            } else if(A[i] > 0 && K > 0){
                //3. 负数的个数小于K,判断此时的K是奇数还是偶数
                if(K%2 == 0){
                    //偶数,不做任何反转,因为对一个都是正数的数组反转偶数次结果不变
                    break;
                } else {
                    //奇数,
                    if(i == 0){
                        //考虑特殊情况,全正数数组;
                        A[i] = -A[i];
                    }else if(A[i] > A[i-1]){
                        A[i-1] = -A[i-1];
                    } else {
                        A[i] = -A[i];
                    }
                    break;
                }

            }

        }

        for(int i = 0; i<len; i++){
            res += A[i];
        }

        return res;


    }

    public static void main(String[] args) {
//        [-100,-90,1,2,3]
//        3
        int[] nums = new int[]{4,2,3};
        int k = largestSumAfterKNegations(nums,1);
        System.out.println(k);

    }
}