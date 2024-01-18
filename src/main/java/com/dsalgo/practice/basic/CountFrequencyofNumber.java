package com.dsalgo.practice.basic;

public class CountFrequencyofNumber {
    public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            if (visited[i] == true) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            visited[i]=true;
            System.out.println("Frequency of:" + arr[i] + ":" + count);

        }
    }

}
