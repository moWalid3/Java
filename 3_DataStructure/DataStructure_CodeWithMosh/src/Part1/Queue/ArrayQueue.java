package Part1.Queue;

import java.util.Arrays;

public class ArrayQueue {
    private int [] items;
    private int front;
    private int rear;
    private int size;
    public ArrayQueue(int max){
        this.items = new int[max];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    public void enqueue(int item){
        if (isFull())
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        size++;
    }
    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        size--;
        return item;
    }
    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        return items[front];
    }


    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == items.length;
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
