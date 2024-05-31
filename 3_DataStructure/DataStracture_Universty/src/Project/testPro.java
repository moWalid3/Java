package Project;

public class testPro {
    // main method for testing

    public static void main(String[] args) {
        Pro pro = new Pro();

        Pro.BinarySearchTree8 bst = new Pro.BinarySearchTree8();

        bst.insert(new Pro.Student2("ali", 123, 80));
        bst.insert(new Pro.Student2("Bob", 45, 90));
        bst.insert(new Pro.Student2("Charlie", 7849, 70));
        bst.insert(new Pro.Student2("ali", 1723, 80));
        bst.insert(new Pro.Student2("Bob", 4546, 90));
        bst.insert(new Pro.Student2("Charlie", 2, 70));
        bst.insert(new Pro.Student2("ali", 11, 80));
        bst.insert(new Pro.Student2("Bob", 74, 90));
        bst.insert(new Pro.Student2("Charlie", 367, 70));
        bst.insert(new Pro.Student2("ali", 4, 80));
        bst.insert(new Pro.Student2("Bob", 32, 90));
        System.out.println("Height: " + bst.getSize()); // expected
    }
// Java program to find height of tree

    // A binary tree node
}
