package com.dsalgo.practice.array;

public class SecondSmallestBetter {
    public static int getSecondSmallestElement(int n, int[] a) {
        // Write your code here.
        int smallest = a[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int index = 1; index < a.length; index++) {
            if (a[index] < smallest) {
                smallest=a[index];
            }
        }
        for (int index = 1; index < a.length; index++) {
            if (a[index] > smallest && a[index]<secondSmallest) {
                secondSmallest=a[index];
            }
        }


        return secondSmallest;
    }

    public static void main(String args[]) {
        System.out.println(getSecondSmallestElement(8, new int[]{3, 1,2, 3, 4, 7, 7, 5,}));

    }
}
