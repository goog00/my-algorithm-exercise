package com.demo.sort;

/**
 * 快速排序
 * @author steng
 * @description
 * @date 2020-06-29 7:38 下午
 **/
public class Quick {

    public static void sort(Comparable[] a){


    }

    public static void sort(Comparable[] a,int lo,int hi){

        if(lo > hi){
            return;
        }


    }

    public static void partition(Comparable[] a,int lo,int hi){
        //将数组切为a[lo.....i-1] ,a[i],a[i+1,i]
        int i = lo,j = hi + 1;//左右扫描指针
        Comparable v = a[lo];//切分元素
        while (true){
            //扫描左右,检查扫描是否结束并交换元素

        }


    }
}
