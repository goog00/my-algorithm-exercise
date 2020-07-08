package com.demo.leetcode.回溯算法;

class Solution112_2 {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        System.out.println(root.val);
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        }
        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
//        [0,1,2,3,4,3,4]
        //[25,1,3,1,3,0,2]
        //[5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode8 = new TreeNode(8);

        TreeNode treeNode11 = new TreeNode(11);
        TreeNode treeNode13 = new TreeNode(13);

        TreeNode treeNode4_ = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1);


        treeNode5.left = treeNode4;
        treeNode5.right = treeNode8;

        treeNode4.left = treeNode11;

        treeNode8.left = treeNode13;
        treeNode8.right = treeNode4_;


        treeNode11.left = treeNode7;
        treeNode11.right = treeNode2;

        treeNode4_.right = treeNode1;


        boolean k = hasPathSum(treeNode5,22);
        System.out.println(k);

    }
}