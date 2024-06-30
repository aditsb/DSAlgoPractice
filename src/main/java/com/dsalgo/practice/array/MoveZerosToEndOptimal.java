package com.dsalgo.practice.array;

import java.util.Arrays;

public class MoveZerosToEndOptimal {
    public static void moveZeroes(int[] nums) {
        if(nums==null){
            return;
        }
        if(nums.length==1){
            return ;
        }
        int slowPtr = -1;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 0) {
                slowPtr=index;
                break;
            }
        }
        if(slowPtr>=0) {
            for (int fastPtr = slowPtr + 1; fastPtr < nums.length; fastPtr++) {
                if (nums[fastPtr] != 0) {
                    int temp = nums[fastPtr];
                    nums[fastPtr] = nums[slowPtr];
                    nums[slowPtr] = temp;
                    slowPtr++;

                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 11, 0, 1, 0, 2, 0, 3, 4, 5, 6, 0};
        moveZeroes(arr);
        Arrays.stream(arr).forEach(System.out::println);

    }
}
