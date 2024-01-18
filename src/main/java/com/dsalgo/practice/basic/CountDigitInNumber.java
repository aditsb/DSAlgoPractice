package com.dsalgo.practice.basic;

public class CountDigitInNumber {
    public static void main(String args[]) {
        System.out.println(countDigits(-123));
    }

    public static int countDigits(int num) {
        /*if (num == 0) {
            return 1;
        }*/
        int noOfDigits = 0;
        do {
            num = num / 10;
            noOfDigits++;
        } while ((num != 0));
        return noOfDigits;
    }
}
