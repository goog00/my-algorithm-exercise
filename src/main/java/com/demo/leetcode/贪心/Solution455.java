package com.demo.leetcode.贪心;

import java.util.Arrays;

/**
 * @author steng
 * @description
 * @date 2020-07-04 6:44 下午
 **/
public class Solution455 {

    public static int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0, si = 0;
        while (gi < grid.length && si < size.length) {
            if (grid[gi] <= size[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }

    public static void main(String[] args) {
        //胃口值
        int[] grid = new int[]{1,2,3};
        //饼干
        int[] size = new int[]{1,1};

        int k = findContentChildren(grid,size);
        System.out.println(k);
    }

}
