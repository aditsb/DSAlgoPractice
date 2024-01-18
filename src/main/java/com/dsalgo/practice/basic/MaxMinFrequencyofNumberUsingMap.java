package com.dsalgo.practice.basic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxMinFrequencyofNumberUsingMap {
    public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFreq=0,maxFreqNum=0,minFreq=n,minFreqNum=0;
        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i], 1);
            }

        }
        frequencyMap.keySet().forEach(k -> System.out.println((k + ":" + frequencyMap.get(k))));
        Map.Entry<Integer, Integer> min = Collections.min(frequencyMap.entrySet(),
                Map.Entry.comparingByValue());
        Map.Entry<Integer, Integer> max = Collections.max(frequencyMap.entrySet(),
                Map.Entry.comparingByValue());
        System.out.println("Number:" + min.getKey() + " Min frequency:" + min.getValue());
        System.out.println("Number:" + max.getKey() + " Max frequency:" + max.getValue());



    }

}
