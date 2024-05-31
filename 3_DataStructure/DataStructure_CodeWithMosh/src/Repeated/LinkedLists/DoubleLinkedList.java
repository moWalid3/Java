package Repeated.LinkedLists;

public class DoubleLinkedList {
    public class Node{
        public int data;
        public Node next;
        public Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        public void displayNode(){
            System.out.print(data+",  ");
        }
    }

    Node first;
    Node last;

    public void displayForward(){
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
    public void displayBackward(){
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);

        if (isEmpty())
            last = newNode;
        else
            first.previous = newNode;

        newNode.next = first;
        first = newNode;
    }
    public void insertAfter (int key,int data){
        Node newNode = new Node(data);
        Node current = first;
        while (current != null){
            if (current.data == key) {
                newNode.next = current.next;
                newNode.previous = current;
                current.next.previous = newNode;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }
    public Node deleteAfter(int key){
        Node temp;
        Node current = first;

        while (current.data != key)
            current = current.next;

        temp = current;

        current.previous.next = current.next;
        current.next.previous = current.previous;

        return temp;
    }
    public boolean isEmpty(){
        return first == null ;
    }











}
