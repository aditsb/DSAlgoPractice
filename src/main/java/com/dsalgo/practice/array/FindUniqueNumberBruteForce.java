package com.dsalgo.practice.array;

//https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/
public class FindUniqueNumberBruteForce {

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }

    private static int getSingleElement(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int index = 0; index < arr.length; index++) {
                if (num == arr[index]) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return 0;

    }
}