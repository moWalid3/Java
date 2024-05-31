package AssignmentLectures.java.StackQueueAssignment;

public class QueueOfPerson {
    private Person [] arr;
    private int front;
    private int rear;

    public QueueOfPerson(int max) {
        this.arr=new Person[max];
        this.front=0;
        this.rear=-1;
    }

    public boolean isEmpty(){
        return this.rear + 1 == this.front;
    }

    public boolean isFull(){
        return this.rear == this.arr.length - 1;
    }

    public void insert(Person person) {
        if (isFull())
            this.rear = -1;
        this.arr[++this.rear] = person;
    }

    public Person remove() {
        if (isFull())
            this.front=0;
        return this.arr[this.front++];
    }

    public Person peekFront(){
        return this.arr[this.front];
    }

    public int sizeArr(){
        return (this.rear - this.front + 1);
    }

    public void showElms(){
        for (int i = this.front; i < this.rear + 1; i++) {
            this.arr[i].displayPerson();
        }
    }

}
