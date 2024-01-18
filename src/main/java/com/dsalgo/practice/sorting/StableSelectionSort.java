package com.dsalgo.practice.sorting;

public class StableSelectionSort {


    public static void main(String args[]) {
        StableSelectionSort ob = new StableSelectionSort();
        int arr[] = {64, 25, 11, 12, 22, 11, 64};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

           int key=arr[minIndex];
           while(minIndex>i){
               arr[minIndex]=arr[minIndex-1];
               minIndex--;
           }
            arr[i]=key;


        }
    }

}

