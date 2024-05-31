package AssignmentLectures.java.StackQueueAssignment;

public class LeftRightQueue {

    private Person []arr;
    private int front;
    private int rear;
    private int nElms;

    public LeftRightQueue(int max) {
        arr=new Person[max];
        front=0;
        rear=-1;
        nElms=0;
    }

    public boolean isEmpty(){
        return nElms==0;
    }

    public boolean isFull(){
        return nElms == arr.length;
    }

    public void addRight(Person person) {
        arr[++rear]=person;
        nElms++;
    }

    public Person removeRight(){
        nElms--;
        return arr[rear--];
    }

    public void addLeft(Person person) {
        for (int i = nElms - 1; i >= front ; i--) {
            arr[i + 1] = arr[i];
        }
        arr[front]=person;
        nElms++;
        rear++;
    }

    public Person removeLeft(){
        nElms--;
        return arr[front++];
    }

    public void showElms(){
        for (int i = front; i < rear + 1; i++) {
            arr[i].displayPerson();
        }
    }

}
