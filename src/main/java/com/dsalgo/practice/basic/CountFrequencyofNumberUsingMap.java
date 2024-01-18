package com.dsalgo.practice.basic;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyofNumberUsingMap {
    public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i], 1);
            }

        }
        frequencyMap.keySet().forEach(k -> System.out.println((k + ":" + frequencyMap.get(k))));


    }

}
