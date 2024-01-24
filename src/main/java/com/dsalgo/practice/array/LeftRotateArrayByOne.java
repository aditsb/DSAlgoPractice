package com.dsalgo.practice.array;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    static int[] leftRotateBtOne(int []arr){
        if(arr!=null && arr.length>1){
            int[]copyArr=new int[arr.length];
            for(int index=0;index< arr.length-1;index++){
                copyArr[index]=arr[index+1];
            }
            copyArr[copyArr.length-1]=arr[0];
            return copyArr;
        }else{
            return arr;
        }
    }

    public static void main(String args[]){
        int []arr={1,2,3,4,5};
        int []outputarr=leftRotateBtOne(arr);
        System.out.println(Arrays.toString(outputarr));
    }
}
