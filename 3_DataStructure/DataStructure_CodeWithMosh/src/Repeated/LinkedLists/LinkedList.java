package Repeated.LinkedLists;

import Part1.LinkedLists.Node;

public class LinkedList {
    private Node first;

    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);

        if (!isEmpty())
            newNode.next = first;

        first = newNode;
    }
    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }
    public void displayList(){
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
    public Node find(int key){
        Node current = first;
        while (current != null){
            if (current.data == key) break;
            current = current.next;
        }
        return current;
    }
    public Node delete(int key){
        Node current = first;
        Node temp = null;

        if (first.data == key){
            temp = first;
            first = first.next;
        }

        while(current.next != null){
            if (current.next.data == key){
                temp = current.next;
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        return temp;
    }




}
