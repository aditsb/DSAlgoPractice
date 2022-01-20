package com.dsalgo.practice.array;

import java.util.Arrays;
import java.util.List;

public class ValidateArraySequence2 {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int arrayIndex = 0;
        int sequenceIndex = 0;

        while (arrayIndex<array.size() && sequenceIndex<sequence.size()){
            if(array.get(arrayIndex)==sequence.get(sequenceIndex)){
                sequenceIndex++;
            }
            arrayIndex++;
        }
        System.out.println(sequenceIndex);
        return sequenceIndex==sequence.size();
    }

    public static void main(String[] args) {

        System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(6,1, -1, 8)));
    }
}
