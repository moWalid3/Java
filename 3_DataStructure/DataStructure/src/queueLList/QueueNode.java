package queueLList;

public class QueueNode {
    int data;
    QueueNode next;
    public QueueNode (int data){
        this.data=data;
        this.next=null;
    }
    public QueueNode (int data,QueueNode next){
        this.data=data;
        this.next=next;
    }
}
