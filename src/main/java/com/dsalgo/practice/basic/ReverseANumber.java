package com.dsalgo.practice.basic;

public class ReverseANumber {
    public static void main(String args[]) {
        System.out.println(reverseNum(123));
    }

    public static int reverseNum(int num) {
        /*if (num == 0) {
            return 1;
        }*/
        int digit = 0;
        int reverse = 0;
        do {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
            System.out.println(reverse);
        } while ((num != 0));
        return reverse;
    }
}

