package com.dsalgo.practice.array;

import java.util.Arrays;

public class ClosestValueinBST {

        public static int findClosestValueInBst(BST tree, int target) {
            // Write your code here.
            int closestValue=-1;
            while(tree!=null ){
                if(tree.value>target){
                    if(tree.value-target>findClosestValueInBst(tree.left,target)){
                        closestValue=tree.left.value;

                    }else{
                        closestValue=tree.value;
                    }

                }
                else if(tree.value<target){
                    if(target-tree.value>findClosestValueInBst(tree.left,target)){
                        closestValue=tree.left.value;

                    }else{
                        closestValue=tree.value;
                    }
                }

            }
            return closestValue;
        }

        static class BST {
            public int value;
            public BST left;
            public BST right;

            public BST(int value) {
                this.value = value;
            }
        }

    public static void main(String[] args) {
        BST bst=new BST(10);
        BST left=new BST(5);
        BST right=new BST(15);
        bst.left=left;
        bst.right=right;
        ClosestValueinBST.findClosestValueInBst(bst,12);
    }
}
