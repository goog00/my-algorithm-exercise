package com.demo.leetcode.双指针;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 349 两个数组的交集
 */
class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {
            if (!map.containsKey(n)) {

                map.put(n, n);

            }
        }

        List<Integer> list = new ArrayList();

        for (int m : nums2) {
            if (map.containsKey(m)) {
                list.add(m);
                map.remove(m);

            }
        }
        int[] tmp = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            tmp[i] = list.get(i);
        }
        return tmp;

    }
}