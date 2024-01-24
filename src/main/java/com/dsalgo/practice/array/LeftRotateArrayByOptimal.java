package com.dsalgo.practice.array;

import java.util.Arrays;

public class LeftRotateArrayByOptimal {

    static int[] leftRotateBtOne(int[] arr) {
        if (arr != null && arr.length > 1) {
            int temp = arr[0];
            for (int index = 0; index < arr.length - 1; index++) {
                arr[index] = arr[index + 1];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;


    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] outputarr = leftRotateBtOne(arr);
        System.out.println(Arrays.toString(outputarr));
    }
}
