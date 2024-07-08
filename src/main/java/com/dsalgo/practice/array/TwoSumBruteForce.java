package com.dsalgo.practice.array;
//https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
public class TwoSumBruteForce {
    public static String twoSum(int n, int []arr, int target) {
    for(int outerIndex=0;outerIndex<arr.length;outerIndex++){
        for(int index=outerIndex+1;index<arr.length;index++){
            if(arr[outerIndex]+arr[index]==target){
                System.out.println("Yes:"+arr[outerIndex]+" "+arr[index]);
            }
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
