package org.example.algorithm.sort;

/**
 * @Author DongLiusuo
 * @create 2020/6/2 21:26
 * <p>
 * 选择排序
 */
public class Selection {

    /*
    选择排序的性能
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
        for (int i = 0; i <= a.length - 2; i++) {
            //定义一个变量，记录最小元素所在的索引，默认为参与选择排序的第一个元素所在的位置
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                //需要比较最小索引minIndex处的值和j索引处的值
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
            }
            //交换最小元素所在索引minIndex处的值和索引i处的值
            exch(a,i,minIndex);
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
