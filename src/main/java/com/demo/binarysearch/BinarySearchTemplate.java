package com.demo.binarysearch;

/**
 * 二分查找算法的模板
 *
 * 关键字:
 *  搜索区间
 *  终止条件
 *
 * @author steng
 * @description
 * @date 2020-06-25 9:09 下午
 **/
public class BinarySearchTemplate {

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {//因为right=arr.length-1,搜索的边界[left,right]

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;//arr[mid]已经和target做过比较,所以此处right = mid - 1,可以减少一次运算
            } else if (arr[mid] < target) {
                left = mid - 1;//同理,见上
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 2, 2, 2, 7};
        int target = 2;
        System.out.println(binarySearch(arr, target));
    }
}
