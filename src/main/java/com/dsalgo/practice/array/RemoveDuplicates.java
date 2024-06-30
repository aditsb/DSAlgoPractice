package com.dsalgo.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RemoveDuplicates {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        int j = 0;
        if (arr == null) {
            return 0;
        }
        for (int index = 1; index < arr.size(); index++) {
            if (arr.get(j) != arr.get(index)) {
                arr.set(j + 1, arr.get(index));
                j = j + 1;
            }

        }
        System.out.println((arr));

        return j + 1;
    }

    static void assign(int arr[], int N)
    {
        // Sort the array
        Arrays.sort(arr);

        int ans[] = new int[N];
        int ptr1 = 0, ptr2 = N - 1;
        for (int i = 0; i < N; i++) {

            // Assign even indexes with maximum elements
            if (i % 2 == 0)
                ans[i] = arr[ptr2--];

                // Assign odd indexes with remaining elements
            else
                ans[i] = arr[ptr1++];
        }

        // Print result
        for (int i = 0; i < N; i++)
            System.out.print(ans[i] + " ");
    }
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);

       // System.out.println(removeDuplicates(list,list.size()));
       /* List<Integer> arr = List.of(1, 3, 5,  7);
        List<Integer> even
                = arr.stream().reduce(new ArrayList<Integer>(),
                (a, b)
                        -> {
                    if (b % 2 == 0)
                        a.add(b);
                    System.out.println("In Reducer");

                    return a;
                },
                (a, b) -> {
                    System.out.println("In Combiner");
                    a.addAll(b);
                    return a;
                });
        System.out.println(even);*/
        int arr[] = { 1, 2, 2, 1,3 };
        int N = arr.length;
        assign(arr, N);
    }
}
