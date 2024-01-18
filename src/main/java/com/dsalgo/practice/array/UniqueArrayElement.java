package com.dsalgo.practice.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UniqueArrayElement {
    static int singleElement(int[] arr, int N) {
        Map<Integer, Integer> frequencyMap = new HashMap();
        // code here
        for (int i : arr) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }

        }
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                return (key);
            }
        }

        return 0;
    }

    public static void main(String args[]) {
        int[] elements = {1, 10, 1, 1};
        System.out.println(singleElement(elements, elements.length));
    }

}
