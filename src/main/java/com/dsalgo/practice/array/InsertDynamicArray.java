package com.dsalgo.practice.array;

import java.io.*;
import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class InsertDynamicArray {


    public static int insert(int []numbers, int filledCapacity, int size, int num,int insertIndex) {
        if(size==filledCapacity|| insertIndex>=size){
            return size;
        }
        for (int index=filledCapacity-1;index>=insertIndex;index--){
            numbers[index+1]=numbers[index];
        }
        numbers[insertIndex]=num;
        return insertIndex;
    }


    public static void main(String[] args) throws IOException {

        int []numbers={10,2,3,4,0,10};
        insert(numbers,5,numbers.length,12,numbers.length-2);
        System.out.println(Arrays.toString(numbers));

    }
}


