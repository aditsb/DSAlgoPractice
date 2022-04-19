package com.dsalgo.practice.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//Reverse an array of integers.
public class ReverseArray {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write youAr code here
        List<Integer> numbers = new ArrayList<>();
        if (a == null) {
            return numbers;
        }
        if (a.size() == 1) {

            return a;
        }
        for (int index = a.size() - 1; index >= 0; index--) {
            numbers.add(a.get(index));
        }
        return numbers;
    }


    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        numbers.add(2);
        numbers.add(3);
        System.out.println(reverseArray(numbers));

    }
}