package com.dsalgo.practice.array;

import java.util.*;

public class TwoSumUsingHashSet {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set numbers = new HashSet<Integer>();
        for(int num:array){
            int targetNum=targetSum-num;
            if(numbers.contains(targetNum)){
                return new int[]{num,targetNum};
            }else{
                numbers.add(num);
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int []arr=new int[]{3,5,-4,8,11,1,-1,6};
        System.out.println(Arrays.toString(twoNumberSum(arr,10)));
    }
}
