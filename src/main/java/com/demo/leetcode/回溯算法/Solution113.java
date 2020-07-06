package com.demo.leetcode.回溯算法;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> paths = new ArrayList<>();
        //记录沿途节点
        Deque<Integer> list = new ArrayDeque<>();
        constructPaths(root,sum,list,paths);
        return paths;

    }

    private void constructPaths(TreeNode root,int sum,Deque<Integer> list,List<List<Integer>> paths){

        if(root != null){
            //sum减去沿途节点,
            sum -= root.val;
            if(root.left == null && root.right == null && sum == 0){
                //叶子节点                              
                list.add(root.val);
                paths.add(new ArrayList(list));  
                // 递归完成以后，回溯必须重置变量 
                list.removeLast();              
              
            } else {
                //非叶子节点
                list.add(root.val);
                constructPaths(root.left,sum,list,paths);//5.left-->4.left-->11.left-->7.left
                constructPaths(root.right,sum,list,paths);//7.right-->11.right-->4.right-->5.right
                // 递归完成以后，回溯 必须重置变量
                //ps:7节点走完后,需要把list中的7节点删去,然后回溯到2(11.right),2节点符合条件,走上面的if分支,也同样需要把list中2节点删去
                //然后回溯到4.right节点,重复同样的操作;
                list.removeLast();

            }
        }

    }
}