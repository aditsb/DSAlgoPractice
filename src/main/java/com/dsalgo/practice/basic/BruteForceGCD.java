package com.dsalgo.practice.basic;

public class BruteForceGCD {
    public static void main(String args[]) {

        System.out.println(gcd(4,8));

    }

    public static int gcd(int num, int num2) {
        int min = num;
        if (num > num2) {
            min = num2;
        }

        int divisor = 1;
        int gcd = 0;
        do {
            if (num % divisor == 0 && num2 % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        } while ((divisor <= min));
        return gcd;
    }
}
