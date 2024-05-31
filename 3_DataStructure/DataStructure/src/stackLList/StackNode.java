package stackLList;

public class StackNode {
     int data;
     StackNode next;
    public StackNode(int data){
        this.data=data;
        this.next=null;
    }
    public StackNode(int data, StackNode next) {
        this.data=data;
        this.next=next;
    }
}
