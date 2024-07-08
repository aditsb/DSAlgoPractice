package com.dsalgo.practice.array;

import java.util.HashMap;

//https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
public class TwoSumHashMap {
    public static String twoSum(int n, int []arr, int target) {
        HashMap numbers=new HashMap<Integer,Integer>();
        for(int index=0;index<arr.length;index++){
            if(numbers.containsKey(target-arr[index])){
                return "Yes:"+arr[index]+":"+numbers.get(target-arr[index]);
            }else{
                numbers.put(arr[index],index);
            }
        }
        return "No";
    }
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
