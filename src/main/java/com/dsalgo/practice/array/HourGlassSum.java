package com.dsalgo.practice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HourGlassSum {

    public static int calculateHourGlassSum(List<List<Integer>> arr) {
        int resultSum = 0;
        // Write your code here
        if (arr == null) {
            return resultSum;

        }
        if (arr.size() != 6 && !(arr.stream().count() == 6)) {
            return resultSum;
        }
        Integer[][] numbers =
                arr.stream()
                        .map(l -> l.toArray(new Integer[l.size()]))
                        .toArray(Integer[][]::new);
        resultSum = Integer.MIN_VALUE;
        int arrSum = 0;
        for (int i = 0; i <= arr.size() - 3; i++) {

            for (int j = 0; j <= arr.stream().count() - 3; j++) {
                arrSum =  numbers[i][j] + numbers[i][j + 1] + numbers[i][j + 2] + numbers[i+1][j+1]
                        + numbers[i + 2][j] + numbers[i + 2][j + 1] + numbers[i + 2][j + 2];
                if (arrSum > resultSum) {
                    resultSum = arrSum;
                }
            }
        }
        return resultSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = HourGlassSum.calculateHourGlassSum(arr);

        System.out.println("result"+result);
        bufferedReader.close();
    }
}
