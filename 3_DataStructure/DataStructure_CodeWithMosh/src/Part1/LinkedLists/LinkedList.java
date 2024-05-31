package Part1.LinkedLists;


import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data=data;
        }
    }

    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty(){
        return first == null;
    }

    public void addFirst(int data){
        Node node = new Node(data);

        if (isEmpty())
           first = last = node;
        else {
            node.next=first;
            first = node;
        }
        size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public int indexOf(int data){
        Node current = first;
        int index=0;
        while (current != null) {
            if (current.data == data)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int data){
        return indexOf(data) != -1;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            Node second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            last = getPrevious(last);
            last.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node){
        Node current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] items = new int[size];
        Node current = first;
        int index = 0;
        while (current != null) {
            items[index++] = current.data;
            current = current.next;
        }
        return items;
    }

    public void reverse(){
        if (isEmpty())
            return;

        Node current = first.next;
        Node currentParent = first;
        Node pointer ;
        while (current != null) {
            pointer = current.next;
            current.next = currentParent;
            currentParent = current;
            current = pointer;
        }

        last = first;
        last.next = null;
        first = currentParent;
    }

    public void printMiddle(){
        if (isEmpty())
            throw new IllegalStateException();

        Node firstPointer = first;
        Node secondPointer = first;

        while (secondPointer.next != null && secondPointer.next.next != null) {
            /*      s   f                   s       f
                    1   1                   0       0
                    3   2                   2       1
                    5   3                   4       2
                    7   4                   6       3
                    9   5                   8       4

                                      f           s
                        [10, 20, 30, 40, 50, 60, 70, 80]
             */

            secondPointer = secondPointer.next.next;
            firstPointer = firstPointer.next;
        }
        if (secondPointer.next != null)
            System.out.println(firstPointer.data + ", " + firstPointer.next.data);
        else
            System.out.println(firstPointer.data);
    }

    public boolean hasLoop() {
        Node slow = first;
        Node fast = first;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static LinkedList createWithLoop() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Get a reference to 30
        Node node = list.last;

        list.addLast(40);
        list.addLast(50);

        // Create the loop
        list.last.next = node;

        return list;
    }

    public int getKthFromTheEnd(int k){
        if (isEmpty())
            throw new IllegalStateException();

        Node firstPtr = first;
        Node secondPtr = first;
        for (int i = 0; i < k - 1; i++) {
            secondPtr = secondPtr.next;
            if (secondPtr == null)
                throw new IllegalArgumentException();
        }
        while (secondPtr.next != null) {
            secondPtr = secondPtr.next;
            firstPtr = firstPtr.next;
        }
        return firstPtr.data;
    }



}
