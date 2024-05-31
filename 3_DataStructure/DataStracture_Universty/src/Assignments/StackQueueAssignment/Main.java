package AssignmentLectures.java.StackQueueAssignment;

public class Main {
    public static void main(String[] args) {

        QueueOfPerson queueOfPerson = new QueueOfPerson(100);
        queueOfPerson.insert(new Person("mo","abdo",19));
        queueOfPerson.insert(new Person("ali","ahmed",22));
        queueOfPerson.insert(new Person("belal","omar",33));
        queueOfPerson.insert(new Person("mostafa","hossam",44));
        queueOfPerson.remove();
        queueOfPerson.remove();
        queueOfPerson.showElms();
///////////////////////////////////////////////////////////
        System.out.println("*********************************************");
        StackOfPerson stackOfPerson = new StackOfPerson(100);
        stackOfPerson.push(new Person("mo","abdo",19));
        stackOfPerson.push(new Person("ali","ahmed",22));
        stackOfPerson.push(new Person("belal","omar",33));
        stackOfPerson.push(new Person("mostafa","hossam",44));
        stackOfPerson.pop();
        stackOfPerson.pop();
        stackOfPerson.showElms();
///////////////////////////////////////////////////////////
        System.out.println("*********************************************");
        LeftRightQueue leftRightQueue = new LeftRightQueue(100);
        leftRightQueue.addLeft(new Person("mo","abdo",19));
        leftRightQueue.addRight(new Person("ali","ahmed",22));
        leftRightQueue.addLeft(new Person("belal","omar",33));
        leftRightQueue.addRight(new Person("mostafa","hossam",44));
        leftRightQueue.removeLeft();
        leftRightQueue.removeRight();
        leftRightQueue.showElms();
    }
}
