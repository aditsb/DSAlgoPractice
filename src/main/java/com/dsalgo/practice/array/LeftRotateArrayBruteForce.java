package com.dsalgo.practice.array;

import java.util.Arrays;

public class LeftRotateArrayBruteForce {

    public static int[] rotateLeft(int rotateLimit, int[] arr) {
         rotateLimit=rotateLimit%arr.length;
         int[]temp=new int[rotateLimit];
      for(int index=0;index<rotateLimit;index++){
          temp[index]=arr[index];

      }
        for(int index=rotateLimit;index<arr.length;index++){
            arr[index-rotateLimit]=arr[index];

        }
        int arrSize=arr.length;
        for(int index=arrSize-rotateLimit;index<arrSize;index++){
            arr[index]=temp[index-(arrSize-rotateLimit)];

        }

        System.out.println(Arrays.toString(temp));
      return arr;
    }

    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5};

        Arrays.stream(LeftRotateArrayBruteForce.rotateLeft(2, arr)).distinct().forEach(System.out::println);
    }
}


