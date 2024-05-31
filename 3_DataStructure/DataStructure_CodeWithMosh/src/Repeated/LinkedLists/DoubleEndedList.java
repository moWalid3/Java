package Repeated.LinkedLists;

import Part1.LinkedLists.Node;

public class DoubleEndedList {
    Node first;
    Node last;
    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);

        if (isEmpty())
            last = newNode;

        newNode.next = first;
        first = newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);

        if(isEmpty())
            first =
                    newNode;
        else
            last.next = newNode;

        last = newNode;
    }
    public Node deleteFirst(){
        Node temp = first;
        if (first == last) // or first.next == null
            last = null;

        first = first.next;

        return temp;
    }

    public void displayList(){
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }


}





