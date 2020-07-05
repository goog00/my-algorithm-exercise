package com.demo.leetcode.回溯算法;

class Solution108 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }


    //预备知识点:需要明白什么是二叉搜索树(根节点大于左子树的结点,小于右子树的结点)
    //中序遍历:1.先左子树 2.根节点 3.右子树
    //题意给定的有序数组 正好符合 一棵二叉搜索树的中序遍历的结果,要求根据数组转换成平衡二叉树
    //从数组的中心节点开始,作为根节点;
    //中心节点右半部分,作为左子树,根据中序遍历规则:左中右;递推到最左边元素停止,开始往上返回
    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        //[-15,-12,-11,-10,-3,0,5,9,10,11,12]
        int[] nums = new int[]{-15,-12,-11,-10,-3,0,5,9,10,11,12};
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println(treeNode);
    }
}

