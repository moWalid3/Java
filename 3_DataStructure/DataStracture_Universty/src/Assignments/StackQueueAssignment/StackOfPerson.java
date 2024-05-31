package AssignmentLectures.java.StackQueueAssignment;

public class StackOfPerson {
    private Person [] arr;
    private int top;

    public StackOfPerson(int max) {
        this.arr=new Person[max];
        this.top=-1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public boolean isFull(){
        return this.top == this.arr.length - 1;
    }

    public void push(Person person) {
        this.arr[++this.top] = person;
    }

    public Person pop() {
        return this.arr[this.top--];
    }

    public Person peek() {
        return this.arr[this.top];
    }

    public void showElms(){
        for (int i = 0; i < top + 1; i++) {
            this.arr[i].displayPerson();
        }
    }
}
