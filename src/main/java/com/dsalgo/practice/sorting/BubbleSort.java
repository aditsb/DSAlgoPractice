package com.dsalgo.practice.sorting;

public class BubbleSort {

    static void bubbleSort(int a[], int n) {
        boolean swapped = false;
        for(int i=0;i<n;i++){
            int temp=0;
            boolean isSwappend=false;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSwappend=true;
                }
            }
            if(!isSwappend)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {13,1,12,2,45};
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

}
