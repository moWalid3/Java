package Part1.LinkedLists;

public class Node {
    public int data;
    public Node next;
    public Node (int data){
        this.data = data;
        next = null;
    }
    public void displayNode(){
        System.out.print(data+",  ");
    }
}
