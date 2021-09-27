package com.dsalgo.practice.linkedlist.hackerrank;

public class LinkedList {
    Node header;

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    public LinkedList(Node Node) {
        this.header = Node;
    }

    public LinkedList() {
    }

    public void addToHead(int i) {
        Node node = new Node(i);
        if (header == null) {
            header = node;
        } else {
            Node tempNode = header;
            header = node;
            header.nextNode = tempNode;
        }
    }

    public void addtoTail(int i) {
        Node node = new Node(i);
        if (header == null) {
            header = node;
        } else {
            Node tempNode = header;
            while (tempNode.nextNode != null) {
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = node;
        }
    }

    public void addNodeAfter(int searchValue, int value) {
        Node node = new Node(value);
        if (header != null) {
            Node tempNode = header;
            while (tempNode != null) {
                if (tempNode.data == searchValue) {
                    Node currNode = tempNode.nextNode;
                    tempNode.nextNode = node;
                    node.nextNode = currNode;
                    break;

                }
                tempNode = tempNode.nextNode;
            }
        }
    }

    public void deleteHead() {
        if (header == null) {
            return;
        } else {
            //com.dsalgo.practice.linkedlist.hackerrank.Node tempNode=header;
            header = header.nextNode;

        }
    }

    public void deleteTail() {
        if (header == null) {
            return;
        }
        if (header.nextNode == null) {
            header = null;
        } else {
            Node currentNode = header;
            Node prevNode = new Node();

            while (currentNode.nextNode != null) {
                prevNode = currentNode;
                currentNode = currentNode.nextNode;
            }
            prevNode.nextNode = null;

        }
    }

    public void deleteNodeAfter(int searchValue) {
        Node node = new Node(searchValue);
        if (header != null) {
            Node tempNode = header;
            while (tempNode != null) {
                if (tempNode.data == searchValue) {
                    Node currNode = tempNode.nextNode != null ? tempNode.nextNode.nextNode : tempNode.nextNode;
                    tempNode.nextNode = currNode;
                    break;

                }
                tempNode = tempNode.nextNode;
            }
        }
    }

    public void detectandRemoveLoop(){
        Node slow=header;
        Node fast=header;
        boolean isLoopExists=false;
        while(slow!=null && fast.nextNode!=null){
            slow=slow.nextNode;
            fast=fast.nextNode.nextNode;
            if(slow==fast){

                isLoopExists=true;
                break;
            }
            slow=header;
            while(slow!=fast){

            }
        }
    }


    public void printLinkedList() {
        Node tempNode = header;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.nextNode;
        }
    }

    Node reverse(Node head)
    {
        if (head == null || head.nextNode == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverse(head.nextNode);
        head.nextNode.nextNode = head;

        /* tricky step -- see the diagram */
        head.nextNode = null;

        /* fix the head pointer */
        return rest;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addtoTail(10);
        linkedList.addtoTail((20));
        linkedList.addtoTail((30));
        linkedList.addtoTail((40));
        linkedList.addToHead(5);
        linkedList.addNodeAfter(11,7);
        linkedList.addNodeAfter(5,7);

        System.out.println("Printing original linkedList");
        linkedList.printLinkedList();

        linkedList.deleteHead();
        System.out.println("Printing linkedList after deletion of head");
        linkedList.printLinkedList();

        System.out.println("Printing linkedList after deletion of tail");
        linkedList.deleteTail();
        linkedList.printLinkedList();

        linkedList.deleteNodeAfter(10);
        System.out.println("Printing linkedList after deletion of node after 10");
        linkedList.printLinkedList();

        linkedList.header=linkedList.reverse(linkedList.header);
        System.out.println("Printing reverse linkedList");
        linkedList.printLinkedList();


    }
}
