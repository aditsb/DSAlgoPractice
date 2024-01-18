package com.dsalgo.practice.sorting;

public class SelectionSort {
    public void sort(int[] arr, int n) {

        if (n == arr.length) {
            return;
        }
        int minIndex = n;
        for (int j = n + 1; j < arr.length; j++) {
            if (arr[minIndex] > arr[j]) {
                minIndex = j;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[n];
        arr[n] = temp;

        sort(arr, ++n);
    }


    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {2, 33, 4, 1, 3, 6, 28};
        ob.sort(arr, 0);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    private void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
