package com.demo.sort;

/**
 * @author steng
 * @description 插入排序
 * @date 2020-06-29 8:48 下午
 **/
public class Insertion {

    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i = 0; i < N; i++){
            //将[i] 插入到a[i-1],a[i-2],a[i-3]....之中
            for(int j = i ; j > 0 && less(a[j],a[j-1]); j--){
                exch(a,j,j-1);
            }
        }
    }

    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;

    }

    private static void show(Comparable[] a) { // 在单行中打印数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }


    public static void main(String[] args) {
        Comparable[] a = {3,9,10,1,2,5};
        sort(a);
        show(a);
    }
}
