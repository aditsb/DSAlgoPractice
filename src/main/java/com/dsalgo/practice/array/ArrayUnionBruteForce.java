package com.dsalgo.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayUnionBruteForce {
    public static Integer[] getUnion(int[] arr1, int[] arr2) {
        TreeSet<Integer> unionSet = new TreeSet<>();
        if (arr1 != null) {
            Arrays.stream(arr1).forEach(num -> unionSet.add(num));
        }
        unionSet.stream().forEach(System.out::println);
        System.out.println("-------Output-----------");

        if (arr2 != null) {
            Arrays.stream(arr2).forEach(num -> unionSet.add(num));
        }
        return unionSet.stream().toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 11, 0, 1, 0, 2, 0, 3, 4, 5, 6, 0};
        int[] arr2 = {0, 11, 0, 1, 0, 2, 0, 3, 4, 5, 6, 80};
        Arrays.stream(getUnion(arr1, arr2)).forEach(System.out::println);

    }
}
