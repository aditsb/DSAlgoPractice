package com.dsalgo.practice.array;

import java.time.*;
import java.util.Arrays;

public class SortedSquaredArray2 {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] squares = new int[array.length];
        int smallerNumIndex = 0;
        int largerNumIndex = array.length - 1;
        for (int index = array.length-1; index >=0; index--) {
            if (Math.abs(array[smallerNumIndex]) > Math.abs(array[largerNumIndex])) {
                squares[index]=array[smallerNumIndex]*array[smallerNumIndex];
                smallerNumIndex++;
            }
            else {
                squares[index]=array[largerNumIndex]*array[largerNumIndex];
                largerNumIndex--;
            }
        }


        return squares;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{-11, 2, 3};

        System.out.println(Arrays.toString(sortedSquaredArray(arr)));
    }
}
