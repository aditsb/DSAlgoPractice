package com.dsalgo.practice.array;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
//https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/
public class MoveZerostoEndBruteForce {
    public static int[] moveZeros(int n, int[] a) {
        // Write your code here.
        int[] temp = new int[a.length];
        AtomicInteger count = new AtomicInteger(0);
        IntConsumer intConsumer = (num -> {

            if (num > 0 || num < 0) {
                temp[count.getAndAdd(1)] = num;

            }
        });
        Arrays.stream(a).forEach(num -> {
            intConsumer.accept(num);
        });
        Arrays.stream(temp).forEach(System.out::println);

        return temp;

    }

    public static void main(String[] args) {
        int[] arr = {0,11,0,1, 0, 2, 0, 3, 4, 5, 6, 0};
        moveZeros(arr.length,arr);
    }
}
