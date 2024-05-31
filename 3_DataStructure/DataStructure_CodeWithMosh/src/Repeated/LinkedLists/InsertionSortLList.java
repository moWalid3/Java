package Repeated.LinkedLists;


import Part1.LinkedLists.Node;

public class InsertionSortLList {
    Node first;

    public InsertionSortLList() {
        first = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        Node previous = null; 
        Node current = first;

        while(current != null && newNode.data > current.data) {
            previous = current;
            current = current.next; 
        }
        
        if(previous==null) 
            first = newNode;
        else 
            previous.next = newNode;

        newNode.next = current;
    }

    public Node remove() 
    { 
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
}

