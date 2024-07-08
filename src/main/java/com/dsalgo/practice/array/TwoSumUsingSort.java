package com.dsalgo.practice.array;

import java.util.*;
//https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
public class TwoSumUsingSort {
    public static int[] twoNumberSum(int[] array, int targetSum) {
       Arrays.sort(array); // Write your code here.
        int leftIndex=0;
        int rightIndex=array.length-1;
        for(int count=0;count<array.length;count++){
            if(array[leftIndex]+(array[rightIndex])==targetSum){
                return new int[]{array[leftIndex],array[rightIndex]};
            }else if(array[leftIndex]+array[rightIndex]<targetSum){
                leftIndex++;

            }else if(array[leftIndex]+array[rightIndex]>targetSum){
                rightIndex--;
            }
            System.out.println(count);
        }
        return new int[0];
    }

    public static void main(String []args){
      int []array=new int[]{3,5,-4,8,11,1,-1,6};
        System.out.println(Arrays.toString(twoNumberSum(array,110)));
    }
}