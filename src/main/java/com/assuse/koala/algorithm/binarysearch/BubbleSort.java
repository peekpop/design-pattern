package com.assuse.koala.algorithm.binarysearch;

import java.util.Arrays;

/**
 * @Author: www.assuse.com
 * @Date: 2019/10/17 11:10
 * @Description: 冒泡排序
 * 冒泡排序只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。
 * 如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置，重复n 次，就完成了 n 个数据的排序工作。
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = {3, 38, 5, 44, 15, 36, 26, 47, 27, 2, 46, 4, 19, 50, 48};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        bubbleSortGeneral(arr);
        System.out.println("冒泡排序一般写法：" + Arrays.toString(arr));
    }

    /**
     * 冒泡排序逻辑方法
     *
     * @param arr 需要排序的数组
     * @param n   数组长度
     */
    public static void bubbleSort(Integer[] arr, int n) {
        //如果只有一个元素就不用排序了
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            // 此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面
            for (int j = 0; j < n - i - 1; ++j) {
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (arr[j] > arr[j + 1]) {  // 即这两个相邻的数是逆序的，交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            // 没有数据交换，数组已经有序，退出排序
            if (!flag) break;
        }
    }

    /**
     * 冒泡排序一般写法
     *
     * @param arr
     */
    public static void bubbleSortGeneral(Integer[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
