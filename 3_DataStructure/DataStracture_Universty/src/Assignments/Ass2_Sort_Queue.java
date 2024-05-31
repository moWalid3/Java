package AssignmentLectures.java;

public class Ass2_Sort_Queue {
    static class  Queue {
        private int[] arr;
        private int front;
        private int rear;
        private int capacity;
        private int count;

        Queue(int size) {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
            count = 0;
        }
        public int dequeue() {
            if (isEmpty())
                return -1;
            int x = arr[front];
            System.out.println("Removing " + x);
            front = (front + 1) % capacity;
            count--;
            return x;
        }
        public void enqueue(int item) {
            if (isFull())
                return;
            System.out.println("Inserting " + item);
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            count++;
        }
        public int peek() {
            if (isEmpty())
                return -1;
            return arr[front];
        }
        public int size() {
            return count;
        }
        public boolean isEmpty() {
            return (size() == 0);
        }
        public boolean isFull() {
            return (size() == capacity);
        }
        void copy (Queue Q_from,Queue Q_to){
            while(!Q_from.isEmpty()){
                int t = Q_from.front;
                Q_to.enqueue(t);
                Q_from.dequeue();
            }
        }
        void sort(Queue Q, int element, Queue Q2){
            if(Q.size()==1){
                if(Q.front>element){
                    int front = Q.front;
                    Q.dequeue();
                    Q.enqueue(element);
                    Q.enqueue(front);
                }
                else{
                    Q.enqueue(element);
                }
            }
            else{
                int front = Q.front;
                Q.dequeue();
                int sorted_front = Q.front;
                if(element<sorted_front){
                    Q2.enqueue(element);
                    copy(Q,Q2);
                    copy(Q2,Q);
                }
                else{
                    Q2.enqueue(sorted_front);
                    Q.dequeue();
                    while(!Q.isEmpty()&&Q.front<element){
                        Q2.enqueue(Q.front);
                        Q.dequeue();
                    }

                    Q2.enqueue(element);
                    copy(Q,Q2);
                    copy(Q2,Q);

                }

            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(30);
        queue.enqueue(40);
        queue.enqueue(56);
        queue.enqueue(22);
        queue.enqueue(657);
        queue.enqueue(2);
        queue.enqueue(153);
        queue.enqueue(5);
        queue.enqueue(322);
        Queue queue1 = new Queue(30);

        queue.sort(queue,queue.front,queue1);
        System.out.println(queue);
    }



}
