package com.dsalgo.practice.array;

public class FindLongestSubArrayWithGivenSumBetter {

    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,0,1,1,1,0,5};
        long k = 3;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    private static int getLongestSubarray(int[] a, long requiredSum) {
        int maxLen = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == requiredSum) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
