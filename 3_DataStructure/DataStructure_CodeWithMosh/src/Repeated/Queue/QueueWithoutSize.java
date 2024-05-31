package Repeated.Queue;

public class QueueWithoutSize {
    int [] items;
    int front;
    int rear;
    int size =0;
    public QueueWithoutSize (int max){
        this.front = 0;
        this.rear = 0;
        this.items = new int[max];

    }
    public boolean isEmpty(){
        return rear == front;
    }
    public boolean isFull(){                        //    1                   6         f + r = len + 1
        return size == items.length;                // [ 33, 33 ,5 ,65, ,56 ,46 ]        3  2
    }                                               //    r                   f
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
