package AssignmentLectures.java.Assignment2;

public class Main {
    public static void main(String[] args) {
        ArrayOfPerson arr=new ArrayOfPerson(100);
        Person person1=new Person("mo","abdo",33);
        Person person2=new Person("ali","ahmed",22);
        Person person3=new Person("belal","omar",56);
        Person person4=new Person("mostafa","hossam",11);
        arr.insert(person1);
        arr.insert(person2);
        arr.insert(person3);
        arr.insert(person4);
        arr.bubbleSort();
        System.out.println(arr.binarySearch(person1));
    }
}
