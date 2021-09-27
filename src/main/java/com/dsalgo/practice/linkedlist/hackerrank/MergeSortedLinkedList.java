package com.dsalgo.practice.linkedlist.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergeSortedLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.println((String.valueOf(node.data)));

            node = node.next;


        }
    }

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head3 = new SinglyLinkedListNode(Integer.MIN_VALUE);
        SinglyLinkedListNode originalNode=head3;
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        } else if (head1 != null && head2 != null) {
            while (head1 != null && head2 != null) {
                if (head1.data > head2.data) {
                    head3.next = new SinglyLinkedListNode(head2.data);
                    head2 = head2.next;
                } else if (head1.data < head2.data) {
                    head3.next = new SinglyLinkedListNode(head1.data);
                    head1 = head1.next;
                } else {
                    head3.next = new SinglyLinkedListNode(head1.data);
                    head3.next.next= new SinglyLinkedListNode(head1.data);
                    head2 = head2.next;
                    head1 = head1.next;
                    head3=head3.next;
                }
                head3 = head3.next;
            }
            if(head1!=null){
                head3.next =head1;

            }else if(head2!=null){
                head3.next = head2;

            }

        }

        return originalNode.next;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);
            System.out.println("Printing list");
            printSinglyLinkedList(llist3, " ");
        }


        scanner.close();
    }
}
