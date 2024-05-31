package queueLList;



public class QueueLList {
    QueueNode front;
    QueueNode back;

    public QueueLList() {
        this.front=null;
        this.back=null;
    }
    public boolean isEmpty(){
        return (front == null) ;
    }
    public QueueNode deQueue(){
        if (isEmpty())
            System.out.println("pro your queue is empty....");
        QueueNode temp=front;
        front=front.next;
        if (front==null)
            back=null;
        return temp;
    }
    public void enQueue(int data){
        if (isEmpty()){
            front = back = new QueueNode(data);
        }else {
            back.next = new QueueNode(data);
            back = back.next;
        }
    }
    public int enFront(){
        return front.data;
    }
    public int size(){
        QueueNode helpPointer =front;
        int counter=0;
        while (helpPointer != null) {
            counter++;
            helpPointer=helpPointer.next;
        }
        return counter;
    }
    public void print(){
        QueueNode helpPointer=front;
        while (helpPointer!=null){
            System.out.print(helpPointer.data+" , ");
            helpPointer=helpPointer.next;
        }
        System.out.println();
    }
    public boolean search(int data){
        if (isEmpty()) {
            System.out.println("pro your linked list is empty ....");
        }else {
            QueueNode helpPointer=front;
            while (helpPointer!=null){
                if (helpPointer.data==data)
                    return true;
                helpPointer=helpPointer.next;
            }
        }
        return false;
    }
    public void smallAndBig(){
        if (isEmpty()) {
            System.out.println("pro your linked list is empty...");
            return;
        }
        int small=front.data;
        int big=front.data;
        QueueNode helpPointer=front;
        while (helpPointer != null) {
            if (helpPointer.data<small)
                small=helpPointer.data;
            if (helpPointer.data>big)
                big=helpPointer.data;
            helpPointer=helpPointer.next;
        }
        System.out.println("the smallest number is : "+small);
        System.out.println("the biggest number is : "+big);
    }
}
