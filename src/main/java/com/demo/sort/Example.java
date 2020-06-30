package com.demo.sort;

/**
 * 排序模板方法
 * @author steng
 * @description
 * @date 2020-06-29 8:18 下午
 **/
public class Example {

    public static boolean less(Comparable v,Comparable w){

        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static void show(Comparable[] a) { // 在单行中打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
