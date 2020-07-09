package com.demo.leetcode.堆;

import java.util.Collections;
import java.util.PriorityQueue;

class SolutionOffer40 {
    public int[] getLeastNumbers(int[] arr, int k) {

        //小项堆
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k, Collections.reverseOrder());
        for(int i : arr){
            if(q.size() < k){
                q.offer(i);
            } else if(q.peek() > i ){
                q.poll();
                q.offer(i);
            }
        }

        Object[] aa = q.toArray();
        int[] bb = new int[aa.length];
        for(int i = 0; i< aa.length; i++){
            bb[i] = (Integer)aa[i];
        }


        return bb;

    }

    public static void main(String[] args) {
//        [0,0,0,2,0,5]
//        0

//        [0,0,1,2,4,2,2,3,1,4]
//        8
        int[] aa = new int[]{0,0,1,2,4,2,2,3,1,4};
        SolutionOffer40 solution = new SolutionOffer40();
        int[] bb = solution.getLeastNumbers(aa,8);
        for(int i : bb){
            System.out.print(i + "  ");
        }

    }
}