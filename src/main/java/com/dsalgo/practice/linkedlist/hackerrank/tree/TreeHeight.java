package com.dsalgo.practice.linkedlist.hackerrank.tree;

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TreeHeight {

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    public static int calculateHeight(Node root) {
        int height = 0;

        if (root==null ||(root .right== null && root.left==null)) {
            return 0;
        } else if(root.left!=null || root.right!=null) {
            height++;
            int leftHeightTree=calculateHeight(root.left);
            int rightHeightTree=calculateHeight(root.right);
            height += leftHeightTree>rightHeightTree?leftHeightTree:rightHeightTree;
        }
        return height;
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
        scan.close();
        int height = calculateHeight(root);
        System.out.println("height of the tree:" + height);
    }
}
