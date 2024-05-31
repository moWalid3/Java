package Repeated.LinkedLists;


import Part1.LinkedLists.Node;

public class LinkQueue {
    DoubleEndedList list;

    public void insert(int data){
        list.insertLast(data);
    }
    public Node delete(){
        return list.deleteFirst();
    }
    public void displayQueue(){
        list.displayList();
    }
}
