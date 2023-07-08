package com.dsalgo.practice.array;

import java.util.ArrayList;

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
        return j + 1;
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
        System.out.println(removeDuplicates(list,list.size()));
    }
}
