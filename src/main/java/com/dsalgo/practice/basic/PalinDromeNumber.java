package com.dsalgo.practice.basic;

import java.util.HashSet;
import java.util.Set;

public class PalinDromeNumber {
    public static void main(String args[]) {
        int num=12121;
        int copy=num;
        Set<String>names=new HashSet<>();
        names.add("ABC");
        names.add("BCD");
        names.add("DEF");
        names.add("AbC");
        System.out.println(names);
        System.out.println(reverseNum(num)==copy?"palindrome number":"Not a palindrome number");

    }

    public static int reverseNum(int num) {
        /*if (num == 0) {
            return 1;
        }*/
        int reverse = 0;
        int digit=0;
        do {
            digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        } while ((num != 0));
        return reverse;
    }
}
