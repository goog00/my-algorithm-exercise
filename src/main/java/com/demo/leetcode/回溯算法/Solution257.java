package com.demo.leetcode.回溯算法;

import java.util.LinkedList;
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
class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
       LinkedList<String> list = new LinkedList();
       constructPaths(root,"",list);      
       return list;
    }


    private void constructPaths(TreeNode root,String path,List<String> list){

        if(root != null){
            path += Integer.toString(root.val);
            if((root.left == null) && (root.right == null)){  
                //叶子节点,保存到list中             
                list.add(path);
            } else {
                //非叶子节点,
                path +="->";                            
                constructPaths(root.left,path,list);
                constructPaths(root.right,path,list);
            }
        }       

    }

}