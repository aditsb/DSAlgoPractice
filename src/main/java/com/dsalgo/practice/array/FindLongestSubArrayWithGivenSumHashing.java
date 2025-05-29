package com.dsalgo.practice.array;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubArrayWithGivenSumHashing {

    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,0,1,1,1,0,5};
        long k = 3;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    private static int getLongestSubarray(int[] a, long requiredSum) {
        int maxLen = 0;
        long sum = 0;
        Map<Long, Integer> sumsMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {

            sum += a[i];
            if (sum == requiredSum) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum-requiredSum ;
            if (rem > 0 && sumsMap.containsKey(rem)) {
                int remIndex = sumsMap.get(rem);
                maxLen = Math.max(maxLen, i  - remIndex);

            }
            if (!sumsMap.containsKey(sum)) {
                sumsMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
