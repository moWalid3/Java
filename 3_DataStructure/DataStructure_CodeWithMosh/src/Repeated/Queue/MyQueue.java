package Repeated.Queue;

public class MyQueue { // circular queue
    int [] items;
    int front;
    int rear;
    int size;
    public MyQueue (int max){
        this.front = 0;
        this.rear = 0;
        this.items = new int[max];
        this.size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == items.length;
    }
    public void insert(int item){
        if (rear == items.length)
            rear = -1;

        items[rear++] = item;
        size++;
    }
    public int remove(){
        if (front == items.length)
            front = 0;

        size--;
        return items[front++];
    }
    public int peek(){
        return items[front];
    }
    public int size(){
        return size;
    }
}
