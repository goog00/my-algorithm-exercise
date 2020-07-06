package com.demo.leetcode.回溯算法;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution988 {

    static String ans = "~";
    public static String smallestFromLeaf(TreeNode root) {

        dfs(root,new StringBuilder());
        return ans;

    }


    private static void dfs(TreeNode root,StringBuilder sb){
        if(root == null){
            return;
        }

        //数字直接转字符
        sb.append((char)('a' + root.val));
        if(root.left == null && root.right == null){
            //第一次反转sb,获取从叶子节点到根节点顺序的字符串
            sb.reverse();
            String str = sb.toString();
            //第二次反转sb,是把字符串的顺序变更回来,以便下次回溯时使用
            sb.reverse();
            if(str.compareTo(ans) < 0){
                ans = str;
            }
        }

        dfs(root.left,sb);
        dfs(root.right,sb);
        //回溯,重置状态
        sb.deleteCharAt(sb.length()-1);

    }

    public static void main(String[] args) {
//        [0,1,2,3,4,3,4]
        //[25,1,3,1,3,0,2]
        TreeNode treeNode25 = new TreeNode(25);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);

        TreeNode treeNode1_ = new TreeNode(1);
        TreeNode treeNode3_ = new TreeNode(3);

        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(2);


        treeNode25.left = treeNode1;
        treeNode25.right = treeNode3;

        treeNode1.left = treeNode1_;
        treeNode1.right = treeNode3_;

        treeNode3.left = treeNode0;
        treeNode3.right = treeNode2;

        String k = smallestFromLeaf(treeNode25);
        System.out.println(k);

    }
}