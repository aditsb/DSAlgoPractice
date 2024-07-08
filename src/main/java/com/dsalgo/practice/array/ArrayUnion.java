package com.dsalgo.practice.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayUnion {

    private static List<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> outputNums = new ArrayList<>();
        int ptr1 = 0;
        int ptr2 = 0;
        int lastIndex = -1;
        while (ptr1 <arr1.length && ptr2 < arr2.length) {
            if (arr1[ptr1] == arr2[ptr2]) {
                lastIndex = getLastIndex(outputNums, arr1[ptr1], lastIndex);
                ptr1++;
                ptr2++;

            } else if (arr1[ptr1] > arr2[ptr2]) {
                lastIndex = getLastIndex(outputNums, arr2[ptr2], lastIndex);
                ptr2++;

            }
            else if (arr1[ptr1] < arr2[ptr2]) {
                lastIndex = getLastIndex(outputNums, arr1[ptr1], lastIndex);
                ptr1++;
            }

        }
        while(ptr1<n){
            lastIndex = getLastIndex(outputNums, arr1[ptr1], lastIndex);
            ptr1++;
        }
        while(ptr2<n){
            lastIndex = getLastIndex(outputNums, arr2[ptr2], lastIndex);
            ptr2++;
        }
        return outputNums;
    }

    private static int getLastIndex(List<Integer> outputNums,int element, int lastIndex) {
        if (lastIndex > 0) {
            if (outputNums.get(lastIndex) != element) {
                outputNums.add(++lastIndex, element);
            }
        }
       else{
           outputNums.add(++lastIndex, element);
        }
        return lastIndex;
    }


    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        List<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }


}