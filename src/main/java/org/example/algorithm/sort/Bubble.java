package org.example.algorithm.sort;

/**
 * @Author DongLiusuo
 * @create 2020/6/2 21:26
 *
 * 冒泡排序
 */
public class Bubble {

    /*
    冒泡排序的性能
        在最坏的情况下，{6,5,4,3,2,1}
        比较次数为(n-1)+(n-2)+(n-3)+...+2+1=n^2/2-n/2
        交换次数为(n-1)+(n-2)+(n-3)+...+2+1=n^2/2-n/2
        总交换次数为n^2-n
        时间复杂度O(n^2)
     */

    /**
     * 对数组a中的元素进行排序
     * @param a
     */
    public static void sort(Comparable[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //比较索引j和索引j+1处的值
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    /**
     * 比较v元素是否大于w元素
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w)>0;
    }

    /**
     * 数据元素i和j交换位置
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
