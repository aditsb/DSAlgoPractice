package com.dsalgo.practice.array;

public class SortedArrayTest {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int index=1;index<a.length;index++){
            if(!(a[index]>=a[index-1]))
            {
                return 0;
            }

        }
        return 1;
    }

    public static void main(String args[]){
        if(isSorted(8,new int[]{1,2,3,4,7,7,8,9,6})==0){
            System.out.println("Unsorted array");
        }else{
            System.out.println("Sorted array");
        }

    }
}
