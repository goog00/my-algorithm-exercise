package com.demo.sort;


import static com.demo.sort.Example.less;
import static com.demo.sort.Example.show;

/**
 * @author steng
 * @description 归并排序
 * @date 2020-06-30 8:32 下午
 **/
public class Merge {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {

        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);

    }

    private static void sort(Comparable[] a, int lo, int hi) {
        //将数组a[lo....hi]
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid); // 将左半边排序
        sort(a, mid + 1, hi); // 将右半边排序
        merge(a, lo, mid, hi); // 归并结果(代码见“原地归并的抽象方法”)
    }


    //原地归并的抽象方法
    private static void merge(Comparable[] a, int lo, int mid, int hi) {

        // 将a[lo..mid] 和 a[mid+1..hi] 归并
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) { //将a[lo..hi]复制到aux[lo..hi]
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }

    public static void main(String[] args) {
        //M,E,R,G,E,S,O,R,T,E,X,A,M,P,L,E
        String s = "MERGESORTEXAMPLE";
        char[] chars = s.toCharArray();
        Comparable[] a = new Comparable[chars.length];
        for(int i = 0; i < chars.length; i++){
            a[i] = chars[i];
        }
        sort(a);
        show(a);


    }


}
