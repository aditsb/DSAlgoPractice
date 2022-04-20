package com.dsalgo.practice.array;

import java.util.Arrays;

public class MinimumAmountOfChange {

    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
        int miniMumSum = 0;
        for (int coin : coins) {
            if (coin > miniMumSum + 1) {
                return miniMumSum + 1;
            }
            miniMumSum += coin;
        }

        return miniMumSum + 1;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumAmountOfChange().nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 20}));
    }
}
