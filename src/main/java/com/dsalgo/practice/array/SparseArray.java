package com.dsalgo.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SparseArray {

        public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
            // Write your code here
            HashMap<String,Integer> stringCountMap=new HashMap<>();
            for(String value:strings){
                stringCountMap.computeIfPresent(value,(key,val)->val+1);
                stringCountMap.computeIfAbsent(value,key->1);

            }
            List<Integer>stringCounts=new ArrayList<>();
            for(String query:queries){
                int stringCount=stringCountMap.getOrDefault(query,0);
                stringCounts.add(stringCount);
            }

            return stringCounts;
        }



        public static void main(String[] args) {
            SparseArray.matchingStrings(Arrays.asList("aba","baba","aba","xzxb"),Arrays.asList("aba","xzxb","ab")).forEach(System.out::println);
        }
    }


