package com.dsalgo.practice.array;

import java.util.Arrays;

public class LeftRotateArrayOptimised {

    public static int[] rotateLeft(int rotateLimit, int[] arr) {
        reverse(arr, 0, rotateLimit);
        reverse(arr, rotateLimit+1, arr.length-1);
        reverse(arr, 0, arr.length-1);

        return arr;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
       /* {3,2,1,4,5,6,7};
        {3,2,1,7,6,5,4}
        {4,2,1,7,6,5,3}
        {4,5,1,7,6,2,3}
        {4,5,6,7,1,2,3}*/

        Arrays.stream(LeftRotateArrayOptimised.rotateLeft(2, arr)).distinct().forEach(System.out::println);
    }
}


