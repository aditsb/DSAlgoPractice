package com.dsalgo.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSumUsingSort {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        int left=0;
        int right=array.length-1;
        while(left<right){
            int currentSum=array[left]+array[right];
            if(targetSum==currentSum){
                return new int[]{array[left],array[right]};
            }else if(currentSum<targetSum){
                left++;
            }else if(currentSum>targetSum){
                  right--;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int []arr=new int[]{3,5,-4,8,11,1,-1,6};

        System.out.println(Arrays.toString(twoNumberSum(arr,10)));
    }
}
