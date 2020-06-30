package com.demo.sort;

/**
 * @author steng
 * @description 算法比较器
 * @date 2020-06-29 9:32 下午
 **/
public class SortCompare {


    public static Double time(String alg, Comparable[] a) {
//        Stopwatch timer = new Stopwatch();
        if(alg.equals("Insertion")){
            Insertion.sort(a);
        }
            if(alg.equals("Selection")){
                SelectedSort.sort(a);
            }
                if(alg.equals("Shell")){
//                    Shell.sort(a);
                }
            if(alg.equals("Merge")){
//                Merge.sort(a);
            }
                if(alg.equals("Quick")){
                    Quick.sort(a);
                }
                    if(alg.equals("Heap")){
//                        Heap.sort(a);
                    }

        return null;

    }

}
