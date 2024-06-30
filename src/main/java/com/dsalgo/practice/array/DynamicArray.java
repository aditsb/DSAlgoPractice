package com.dsalgo.practice.array;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray {


    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<List<Integer>>  computation = new ArrayList<>();
        int lastAnswer = 0;
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            computation.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            if (query.get(0) == 1) {
                computation.get ((query.get(1) ^ lastAnswer) % n).add(query.get(2));

            } else if (query.get(0) == 2) {
                List<Integer>result=computation.get ((query.get(1) ^ lastAnswer) % n);
                lastAnswer = result.get(query.get(2)% result.size());
                output.add(lastAnswer);
            }
        }
        return output;
    }


    public static void main(String[] args) throws IOException {

        int n = 2;

        int q = 5;

        List<List<Integer>> queries = new ArrayList<>();


        queries.add(
                Stream.of(1, 0, 5)
                        .collect(toList())
        );
        queries.add(
                Stream.of(1, 1, 7)
                        .collect(toList())
        );
        queries.add(
                Stream.of(1, 0, 3)
                        .collect(toList())
        );
        queries.add(
                Stream.of(2, 1, 0)
                        .collect(toList())
        );
        queries.add(
                Stream.of(2, 1, 1)
                        .collect(toList())
        );

        List<Integer> result = DynamicArray.dynamicArray(n, queries);
        result.forEach(System.out::println);
    }
}


