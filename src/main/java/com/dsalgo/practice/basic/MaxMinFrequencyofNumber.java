package com.dsalgo.practice.basic;

public class MaxMinFrequencyofNumber {
    public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        boolean[] visited = new boolean[n];
        int count = 0;
        int maxFreq=0;int maxFreqNum=0;int minFreq= 1;int minFreqNum=0;
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
            if(count>maxFreq){
                maxFreq=count;
                maxFreqNum=arr[i];
            }
            if(count<=minFreq){
                minFreq=count;
                minFreqNum=arr[i];
            }
            System.out.println("Frequency of:" + arr[i] + ":" + count);

        }
        System.out.println("Max frequency:" + maxFreq + " Number:" + maxFreqNum);
        System.out.println("Min frequency:" + minFreq + " Number:" + minFreqNum);

    }

}
