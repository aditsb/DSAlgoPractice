package com.dsalgo.practice.linkedlist.hackerrank.tree;

import java.util.*;
import java.io.*;


public class LowestCommonAncestor {

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    public static Node lca(Node root, int v1, int v2) {
        Node lcaNode = null;
        Node prevNode = root;
        if (root == null) {
            return root;
        }
        if (root.right != null) {
            if (root.right.data == v1 || root.right.data == v2) {
                if (lcaNode == null) {
                    prevNode = root;
                    lcaNode = root;
                } else {
                    if (lcaNode != root) {
                        lcaNode = prevNode;
                    }
                }
                return lcaNode;
            }
            else {
                lca(root.right, v1, v2);
        }

        }
        if (root.left != null) {
            if (root.left.data == v1 || root.left.data == v2) {
                if (lcaNode == null) {
                    lcaNode = root;
                } else {
                    if (lcaNode != root) {
                        lcaNode = prevNode;
                    }
                }
                return lcaNode;
            }
            else {
                lca(root.left, v1, v2);
            }

        }
        return lcaNode;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of elements in tree");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        int elementIndex = 1;
        while (t-- > 0) {
            System.out.println("Enter " + (elementIndex++) + " element:");

            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root, v1, v2);
        System.out.println("lca:" + ans.data);
    }
}