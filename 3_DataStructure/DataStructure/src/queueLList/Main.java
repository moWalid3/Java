package queueLList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        QueueLList myQueue=new QueueLList();
        myQueue.enQueue(11);
        myQueue.enQueue(22);
        myQueue.enQueue(33);
        myQueue.enQueue(44);
        myQueue.print();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.print();
        myQueue.enQueue(77);
        myQueue.enQueue(88);
        myQueue.print();
        myQueue.smallAndBig();
        System.out.println("**************************************");
        // queue with 10 element Random form 1 : 1000 .
        QueueLList q2=new QueueLList();
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            q2.enQueue(random.nextInt(1000));
        }
        q2.print();

    }
}
