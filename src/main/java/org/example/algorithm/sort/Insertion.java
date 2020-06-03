package org.example.algorithm.sort;

/**
 * @Author DongLiusuo
 * @create 2020/6/2 21:26
 * <p>
 * 插入排序
 */
public class Insertion {

    /*
    插入排序的性能
        在最坏的情况下，{6,5,4,3,2,1}
        比较次数为(n-1)+(n-2)+(n-3)+...+2+1=n^2/2-n/2
        交换次数为(n-1)
        总交换次数为n^2/2-n/2+n-1=n^2/2+n/2-1
        时间复杂度O(n^2)
     */

    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                //比较索引j处的值和索引j-1处的值，如果索引j-1处的值比索引j处的值大，则交换数据，如果不大，已经找到合适的位置，退
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                } else {
                    break;
                }
            }
        }

    }

    /**
     * 比较v元素是否大于w元素
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 数据元素i和j交换位置
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
