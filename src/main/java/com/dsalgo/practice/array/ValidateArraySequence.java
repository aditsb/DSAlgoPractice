package com.dsalgo.practice.array;

import java.util.Arrays;
import java.util.List;

public class ValidateArraySequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int positionIndex = 0;
        for (int val : array) {
            if (positionIndex == sequence.size()) {
                break;
            }
            if (val == sequence.get(positionIndex)) {
                positionIndex++;
            }

        }
        return positionIndex == sequence.size();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 22, 25, 6, -1, 8, 10};

        System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(6,1, -1, 8)));
    }
}
