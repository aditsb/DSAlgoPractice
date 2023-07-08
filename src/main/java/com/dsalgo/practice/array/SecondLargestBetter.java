package com.dsalgo.practice.array;

public class SecondLargestBetter {
    public static int getSecondLargestElement(int n, int[] a) {
        // Write your code here.
        int largest = a[0];
        int secondLargest = -1;
        for (int index = 1; index < a.length; index++) {
            if (a[index] > largest) {
                largest=a[index];
            }
        }
        for (int index = 1; index < a.length; index++) {
            if (a[index] < largest && a[index]>secondLargest) {
                secondLargest=a[index];
            }
        }


        return secondLargest;
    }

    public static void main(String args[]) {
        System.out.println(getSecondLargestElement(8, new int[]{1, 2, 3, 4, 7, 7, 5,}));

    }
}
