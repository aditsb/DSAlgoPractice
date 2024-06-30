package com.dsalgo.practice.array;

import java.util.Arrays;
import java.util.TreeSet;

public class ArrayUnionOptimal {
    public static Integer[] getUnion(int[] arr1, int[] arr2) {
        TreeSet<Integer> unionSet = new TreeSet<>();
        if (arr1 == null && arr2 != null) {
            Arrays.stream(arr2).forEach(num -> unionSet.add(num));
        }
        if (arr2 == null && arr1 != null) {
            Arrays.stream(arr2).forEach(num -> unionSet.add(num));
        }
        if (arr1 != null && arr2 != null) {
            int minArrayLength = arr2.length;
            int maxArrayLength = arr2.length;
            if (arr1.length < arr2.length) {
                minArrayLength = arr1.length;
                maxArrayLength = arr2.length;

            } else if (arr1.length > arr2.length) {
                minArrayLength = arr2.length;
                maxArrayLength = arr1.length;
            }
            int[] outputArr = new int[maxArrayLength];
            int arr2Index = 0;
            int arr1Index = 0;
            for (arr1Index = 0; arr1Index < minArrayLength; arr1Index++) {
                if (arr1[arr1Index] < arr2[arr2Index]) {
                    unionSet.add(arr1[arr1Index]);
                    arr2Index++;
                    unionSet.add(arr1[arr1Index]);

                } else if (arr1[arr1Index] > arr2[arr2Index]) {
                    unionSet.add(arr2[arr2Index]);
                    unionSet.add(arr1[arr1Index]);
                    arr2Index++;

                } else {
                    unionSet.add(arr2[arr1Index]);
                    arr2Index++;
                }

            }
            if (minArrayLength < arr1.length) {
                for (int index = 0; minArrayLength < arr1.length; index++) {
                    unionSet.add(index);
                }
            } else if (minArrayLength < arr2.length) {
                for (int index = minArrayLength; index < arr2.length; index++) {
                    unionSet.add(arr2[index]);
                }
            }


        }
        return unionSet.stream().toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 79};
        int[] arr2 = {0, 2, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 80, 81};
        Arrays.stream(getUnion(arr1, arr2)).forEach(System.out::println);

    }
}
