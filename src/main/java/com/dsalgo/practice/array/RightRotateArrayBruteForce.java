package com.dsalgo.practice.array;

import java.util.Arrays;

public class RightRotateArrayBruteForce {

    public static int[] rotateLeft(int rotateLimit, int[] arr) {
         rotateLimit=rotateLimit%arr.length;
         int[]temp=new int[rotateLimit];
         int position=0;
      for(int index=arr.length-1;index>=(arr.length-rotateLimit);index--){
          temp[position++]=arr[index];

      }
        System.out.println(Arrays.toString(temp));

        int arrSize=arr.length;
        for(int index=arrSize-rotateLimit-1;index>=0;index--){
           arr[index+rotateLimit]= arr[index];

        }
        System.out.println(Arrays.toString(arr));

        for(int index=rotateLimit-1;index>=0;index--){
            arr[index]= temp[rotateLimit-1-index];

        }
// {4,5,1,2,3};

        System.out.println(Arrays.toString(arr));
      return arr;
    }

    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6};
//{5,1,2,3,4};
// [1, 2, 1, 2, 3]
// {4,5,1,2,3};
     Arrays.stream(RightRotateArrayBruteForce.rotateLeft(3, arr)).distinct().forEach(System.out::println);
    }
}


