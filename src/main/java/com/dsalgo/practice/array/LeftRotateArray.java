package com.dsalgo.practice.array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeftRotateArray {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> integers = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < d; i++) {
            integers.add(arr.get(i));
        }
        for (int j =0; d+j < arr.size() ; j++) {
            output.add(j, arr.get(d+j ));
        }
        int rotationCount = d;
        for (int i = 0; i < d; i++) {
            output.add(arr.size() - rotationCount, integers.get(i));
            rotationCount--;
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        LeftRotateArray.rotateLeft(2, arr).forEach(System.out::println);
    }
}


