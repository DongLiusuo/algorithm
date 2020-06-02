package org.example.algorithm.sort;

import java.util.Arrays;

/**
 * @Author DongLiusuo
 * @create 2020/6/2 21:36
 */
public class TestBubble {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 5, 6, 2, 3, 1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
