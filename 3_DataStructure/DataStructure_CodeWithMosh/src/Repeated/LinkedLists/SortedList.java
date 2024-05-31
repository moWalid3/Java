package Repeated.LinkedLists;

import Part1.LinkedLists.Node;

public class SortedList {
    Node first;

    public void insert(int data){ // insert if sorted from small to large
        Node newNode = new Node(data);
        Node current = first;

        while ( current.next != null && current.next.data < data )
            current = current.next;

        newNode.next = current.next;
        current.next = newNode;
    }

    public Node remove(){ // delete first node
        Node temp = first;
        first = first.next;
        return temp;
    }
}
