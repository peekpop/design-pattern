package com.assuse.algorithm.binarysearch;

/**
 * @Author: www.assuse.com
 * @Date: 2019/10/17 11:01
 * @Description: 二分查找
 */
public class BinarySearch {
    /**
     * 二分查找非递归查询
     *
     * @param arrays 要查找的有序数组
     * @param key    要查找的值
     * @return
     * @Description: 中间索引值计算方式有以下两种<br>
     * int mid = low + (high - low) / 2;
     * <p>
     * //防止溢出
     * int mid = (high + low) >>> 1;
     * 说明：要查询数组为偶数个时，需向下取整
     * <br/>
     */
    public static int binarySearch(int[] arrays, int key) {
        // 头指针初始位置
        int low = 0;
        // 尾指针初始位置
        int high = arrays.length - 1;

        // 判断查找的数是否在数组中;
        // 如果此处不加判断，则有可能报 java.lang.StackOverflowError栈内存溢出
        if (low > high || key > arrays[high] || key < arrays[low]) {
            return -1;
        }

        //确保不会出现重复查找，越界
        while (low <= high) {
            //计算出中间索引值，防止溢出
            int mid = (high + low) >>> 1;
            if (key == arrays[mid]) {
                return mid;
            } else if (key < arrays[mid]) {
                // mid所对应的值比key大，key应该在左边区域
                high = mid - 1;
            } else {
                // mid所对应的值比key小，key应该在右边区域
                low = mid + 1;
            }
        }
        //若没有，则返回-1
        return -1;
    }

    /**
     * 二分查找递归查询
     *
     * @param arrays 要查找的有序数组
     * @param low    头指针初始位置
     * @param high   尾指针初始位置
     * @param key    要查找的数
     * @return
     * @Description: <br/>
     * int mid = low + (high - low) / 2;
     * 此算法不存在溢出问题，因为他能保证计算出来的mid，一定是大于low，小于high的。
     */
    public static int recursiveBinarySearch(int[] arrays, int low, int high, int key) {
        // 计算中间索引值
        int mid = low + (high - low) / 2;

        // 判断查找的数是否在数组中;
        // 如果此处不加判断，则有可能报 java.lang.StackOverflowError栈内存溢出
        if (low > high || key > arrays[high] || key < arrays[low]) {
            return -1;
        }

        if (arrays[mid] > key) {
            // mid所对应的值比key大，key应该在左边区域
            return recursiveBinarySearch(arrays, low, mid - 1, key);
        } else if (arrays[mid] < key) {
            //mid所对应的值比key小，key应该在右边区域
            return recursiveBinarySearch(arrays, mid + 1, high, key);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 9};
        int key = 6;
        int low = 0;
        int high = 6;
        // 非递归查找
        int i = binarySearch(arrays, key);
        System.out.println("非递归查找，索引值为：" + i);
        // 递归查找
        int recursiveInt = recursiveBinarySearch(arrays, low, high, key);
        System.out.println("递归查找，索引值为：" + recursiveInt);
    }
}