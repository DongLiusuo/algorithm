package org.example.algorithm.sort;

import com.sun.org.glassfish.gmbal.AMXMBeanInterface;

import java.util.Arrays;

/**
 * @Author DongLiusuo
 * @create 2020/6/2 22:52
 */
public class TestInsertion {
    public static void main(String[] args) {
        Integer[] arr = {4, 6, 8, 7, 9, 2, 10, 1};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
