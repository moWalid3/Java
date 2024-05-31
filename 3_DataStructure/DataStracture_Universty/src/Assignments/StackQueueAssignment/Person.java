package AssignmentLectures.java.StackQueueAssignment;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public void displayPerson() {
        System.out.println("First name: "+this.firstName+"  , Last name: "+this.lastName+"  , age: "+age);
    }
}
