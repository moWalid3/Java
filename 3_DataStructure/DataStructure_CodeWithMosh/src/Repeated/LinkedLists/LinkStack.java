package Repeated.LinkedLists;


import Part1.LinkedLists.Node;

public class LinkStack {
    LinkedList list;

    public void push(int data){
        list.insertFirst(data);
    }
    public Node pop(){
        return list.deleteFirst();
    }
    public void displayStack(){
        list.displayList();
    }



}
