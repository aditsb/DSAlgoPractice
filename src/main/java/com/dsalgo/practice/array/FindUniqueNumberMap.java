package com.dsalgo.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/
public class FindUniqueNumberMap {

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }

    private static int getSingleElement(int[] arr) {
        int count = 0;
        Map elementFrequencyMap = new HashMap<Integer, Integer>();

        Arrays.stream(arr).forEach(num -> {
            elementFrequencyMap.put(num, (int) elementFrequencyMap.get(num) + 1);
        });

        return (int) elementFrequencyMap.keySet().stream().filter(k->(int)elementFrequencyMap.get(k)==1).findFirst().get();


    }
}