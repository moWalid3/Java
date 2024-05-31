package A_class_members;

public class SuperClass {
    // clean code ==> attribute is a first then constructor, and method is the next it.

    int age; // instance variable

    static int count = 10; // class variable


//    SuperClass myObj = new SuperClass();

    // constructor
//    private SuperClass () {
//        age = 88;
//    }


    public static class Main {
        public static void main(String[] args) {
            // this problem called (mutability) in reference data-type only
            SuperClass c1 = new SuperClass();
            c1.age = 10;

            SuperClass c2 = new SuperClass();
            c2 = c1; // so two classes have one reference
                        // so any changed in each of this ==> occur change in other
            c2.age = 20;

            System.out.println(c1.age);
            System.out.println(c2.age);

        }
    }
}
