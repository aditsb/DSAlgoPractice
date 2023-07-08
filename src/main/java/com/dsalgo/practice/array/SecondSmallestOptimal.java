package com.dsalgo.practice.array;

public class SecondSmallestOptimal {
    public static int getSecondLargestElement(int n, int []a) {
        // Write your code here.
        int smallest=a[0];
        int secondSmallest=Integer.MAX_VALUE;
        for (int index=1;index<a.length;index++){
            if(a[index]<smallest){
                secondSmallest=smallest;
                smallest=a[index];
            }
            else if(a[index]>smallest && secondSmallest>a[index]){
                secondSmallest=a[index];
            }
        }


        return secondSmallest;
    }

    public static void main(String args[]){
        System.out.println(getSecondLargestElement(8,new int[]{11,12,3,4,7,7,1,2}));

    }
}
