package com.assuse.algorithm.binarysearch;

/**
 * @Author: www.assuse.com
 * @Date: 2019/10/17 11:10
 * @Description: 冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrSrc = new int[]{7, 1, 3, 8, 5, 2, 9};
        bubbleSort(arrSrc);
    }
}
