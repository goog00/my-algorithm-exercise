package com.demo.binarysearch;

/**
 * 二分查找之取左边界数据算法
 *
 * @author steng
 * @description
 * @date 2020-06-25 9:09 下午
 **/
public class BinarySearchLeftBoundTemplate {

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left < right) {//因为right=arr.length,搜索的边界[left,right)

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                right = mid;
            } else if (arr[mid] > target) {
                right = mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }

        return left;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 2, 2, 2, 7};
        int target = 2;
        System.out.println(binarySearch(arr, target));
    }
}
