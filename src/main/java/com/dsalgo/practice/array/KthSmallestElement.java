package com.dsalgo.practice.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestElement
{
    // Function to find the k'th smallest element in an array using max-heap
    public static int findKthSmallest(List<Integer> input, int k)
    {
        // base case
        if (input == null || input.size() < k) {
            System.exit(-1);
        }

        // create a max-heap using the `PriorityQueue` class and
        // insert the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(input.subList(0, k));
        System.out.println(pq);
        // do for remaining array elements
        for (int i = k; i < input.size(); i++)
        {
            // if the current element is less than the root of the heap
            if (input.get(i) > pq.peek() && !pq.contains(input.get(i)))
            {
                // replace root with the current element
                pq.poll();
                pq.add(input.get(i));
            }
        }
        System.out.println(pq);
        // return the root of max-heap
        return pq.peek();
    }

    public static void main(String[] args)
    {
        List<Integer> input = Arrays.asList(3, 14, 6, 7, 9, 12,5,12,10,4);
        int k = 3;

        System.out.println("k'th smallest array element is " +
                findKthSmallest(input, k));
    }
}