package com.dsalgo.practice.array;

import java.util.Arrays;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] squares = new int[array.length];
        boolean isNegativeNumberFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                isNegativeNumberFound = true;
            }
            squares[i] = array[i] * array[i];

        }
        if (isNegativeNumberFound) {
            sortArray(squares);
        }
        return squares;
    }

    private static void sortArray(int[] squares) {
        for (int i = 0; i < squares.length; i++) {
            for (int j = i+1; j <=squares.length - 1; j++) {
                if (squares[i] > squares[j]) {
                    int temp;
                    temp = squares[j];
                    squares[j] = squares[i];
                    squares[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-11, 2, 3};

        System.out.println(Arrays.toString(sortedSquaredArray(arr)));
    }
}
