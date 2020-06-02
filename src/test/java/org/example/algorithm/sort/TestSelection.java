package org.example.algorithm.sort;

import java.util.Arrays;

/**
 * @Author DongLiusuo
 * @create 2020/6/2 22:03
 */
public class TestSelection {

    public static void main(String[] args) {
        //原始数据
        Integer[] arr = {4, 6, 8, 7, 9, 2, 10, 1};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
