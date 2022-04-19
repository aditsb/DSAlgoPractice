package com.dsalgo.practice.array;

import java.util.*;

public class TwoSumUsingSort {
    public static int[] twoNumberSum(int[] array, int targetSum) {
       Arrays.sort(array); // Write your code here.
        int rightIndex=0;
        int endIndex=array.length-1;
        for(int count=0;count<array.length;count++){
            if(array[rightIndex]+(array[endIndex])==targetSum){
                return new int[]{array[rightIndex],array[endIndex]};
            }else if(array[rightIndex]+array[endIndex]<targetSum){
                rightIndex++;

            }else if(array[rightIndex]+array[endIndex]>targetSum){
                endIndex--;
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