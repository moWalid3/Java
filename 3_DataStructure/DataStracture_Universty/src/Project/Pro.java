package Project;
import java.util.ArrayList;
public class Pro {


    public class BinarySearchTree {
        private class BinaryNode {
            int data;
            BinaryNode left;
            BinaryNode right;

            public BinaryNode(int data) {
                this.data = data;
            }
        }

        private BinaryNode root;

        public int height() {
            return height(root);
        }

        private int height(BinaryNode node) {
            if (node == null) {
                return -1;
            }
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        // other methods of BinarySearchTree
    }
 //   The height method calls a private helper method height(BinaryNode node)
    //   with the root of the tree as argument. The height helper method checks if the current node is null, in which case it returns -1
    //   (as per the specification). Otherwise, it recursively computes the height of the left and right subtrees, and returns the maximum
    //   height plus one (to account for the current node). The height method simply calls the helper method with the root of the tree and
    //   returns its result.


    public class BinarySearchTree7 {
        private class BinaryNode {
            int data;
            BinaryNode left;
            BinaryNode right;

            public BinaryNode(int data) {
                this.data = data;
            }
        }

        private BinaryNode root;

        public int size() {
            return size(root);
        }

        private int size(BinaryNode node) {
            if (node == null) {
                return 0;
            }
            return 1 + size(node.left) + size(node.right);
        }

        // other methods of BinarySearchTree
    }
   // The size method calls a private helper method size(BinaryNode node)
    // with the root of the tree as argument. The size helper method checks if the current node is null, in which case it returns 0
    // (as per the specification). Otherwise, it recursively computes the size of the left and right subtrees,
    // and returns the sum of the sizes plus one (to account for the current node).
    // The size method simply calls the helper method with the root of the tree and returns its result.


    public class BinarySearchTree6 {
        private class BinaryNode {
            int data;
            BinaryNode left;
            BinaryNode right;

            public BinaryNode(int data) {
                this.data = data;
            }
        }

        private BinaryNode root;

        public boolean containsNonBST(int item) {
            return containsNonBST(root, item);
        }

        private boolean containsNonBST(BinaryNode node, int item) {
            if (node == null) {
                return false;
            }
            if (node.data == item) {
                return true;
            }
            return containsNonBST(node.left, item) || containsNonBST(node.right, item);
        }

        // other methods of BinarySearchTree
    }
    //The containsNonBST method calls a private helper method containsNonBST(BinaryNode node, int item)
    // with the root of the tree and the item to search as arguments.
    // The containsNonBST helper method checks if the current node is null,
    // in which case it returns false (as per the specification). Otherwise, it checks if the current node contains the item,
    // in which case it returns true. If neither of these conditions is met,
    // it recursively searches the left and right subtrees for the item, and returns true if it is found in either subtree.
    // The containsNonBST method simply calls the helper method with the root of the tree and the item to search, and returns its result.
    // Note that this implementation does not take advantage of the binary search property of the tree,
    // so it may not be as efficient as possible for large trees.

    public class BinarySearchTree5 {
        private class BinaryNode {
            int data;
            BinaryNode left;
            BinaryNode right;

            public BinaryNode(int data) {
                this.data = data;
            }
        }

        private BinaryNode root;

        public boolean isEmpty() {
            return root == null;
        }

        // other methods of BinarySearchTree
    }
   // The isEmpty method simply checks whether the root field of the binary search tree is null.
    // If it is, the tree is empty and the method returns true. Otherwise,
    // the tree contains at least one node and the method returns false. This implementation is straightforward and efficient,
    // since it only involves a single field access.

    public class BinarySearchTree4 {
        private class BinaryNode {
            int data;
            BinaryNode left;
            BinaryNode right;

            public BinaryNode(int data) {
                this.data = data;
            }
        }

        private BinaryNode root;

        public String toString() {
            return toString(root);
        }

        private String toString(BinaryNode node) {
            if (node == null) {
                return "";
            }
            String leftString = toString(node.left);
            String rightString = toString(node.right);
            String nodeString = Integer.toString(node.data);
            if (!leftString.equals("")) {
                nodeString = leftString + " " + nodeString;
            }
            if (!rightString.equals("")) {
                nodeString = nodeString + " " + rightString;
            }
            return nodeString;
        }

        // other methods of BinarySearchTree
    }
  //  The toString method calls a private helper method toString(BinaryNode node) with the root of the tree as argument.
    //  The toString helper method checks if the current node is null, in which case it returns an empty string (as per the specification).
    //  Otherwise, it recursively obtains the string representations of the left and right subtrees,
    //  and combines them with the string representation of the current node to form the final string.
    //  The toString method simply calls the helper method with the root of the tree and returns its result.
    //  Note that this implementation returns the elements of the tree in a pre-order traversal,
    //  but other traversal orders can be obtained by changing the order in which the strings are combined.




    public class BinarySearchTree3 {
        private class BinaryNode {
            int data;
            BinaryNode left;
            BinaryNode right;

            public BinaryNode(int data) {
                this.data = data;
            }
        }

        private BinaryNode root;

        public ArrayList<Object> toArrayList() {
            ArrayList<Object> list = new ArrayList<>();
            toArrayList(root, list);
            return list;
        }

        private void toArrayList(BinaryNode node, ArrayList<Object> list) {
            if (node == null) {
                return;
            }
            toArrayList(node.left, list);
            list.add(node.data);
            toArrayList(node.right, list);
        }

        // other methods of BinarySearchTree
    }
 //   The toArrayList method creates a new ArrayList<Object> and calls a private helper method
    //   toArrayList(BinaryNode node, ArrayList<Object> list) with the root of the tree and the list as arguments.
    //   The toArrayList helper method checks if the current node is null, in which case it does nothing. Otherwise,
    //   it recursively adds the elements of the left subtree, the current node's data,
    //   and the elements of the right subtree to the list, in that order.
    //   This results in an in-order traversal of the tree.
    //   The toArrayList method simply calls the helper method with the root of the tree and the list, and returns the list.
    //   Note that the elements in the list are of type Object, but they can be cast to Integer if necessary.


    public class Student {
        private String name;
        private int id;
        private double grade;

        public Student(String name, int id, double grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " (ID: " + id + ", Grade: " + grade + ")";
        }
    }
    public class BinarySearchTree2 {
        private class BinaryNode {
            Student student;
            BinaryNode left;
            BinaryNode right;

            public BinaryNode(Student student) {
                this.student = student;
            }
        }

        private BinaryNode root;
        private int comparisons;
        private int swaps;

        public BinarySearchTree2() {
            root = null;
            comparisons = 0;
            swaps = 0;
        }

        public void insert(Student student) {
            root = insert(student, root);
        }

        private BinaryNode insert(Student student, BinaryNode node) {
            if (node == null) {
                swaps++;
                return new BinaryNode(student);
            }
            comparisons++;
            if (student.getId() < node.student.getId()) {
                node.left = insert(student, node.left);
            } else if (student.getId() > node.student.getId()) {
                node.right = insert(student, node.right);
            } else {
                swaps++;
                node.student = student;
            }
            return node;
        }

        public int height() {
            return height(root);
        }

        private int height(BinaryNode node) {
            if (node == null) {
                return -1;
            }
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return 1 + Math.max(leftHeight, rightHeight);
        }

        public int size() {
            return size(root);
        }

        private int size(BinaryNode node) {
            if (node == null) {
                return 0;
            }
            return 1 + size(node.left) + size(node.right);
        }

        public boolean containsNonBST(Student student) {
            return containsNonBST(student, root);
        }

        private boolean containsNonBST(Student student, BinaryNode node) {
            if (node == null) {
                return false;
            }
            if (student.getId() == node.student.getId()) {
                return true;
            }
            if (containsNonBST(student, node.left)) {
                return true;
            }
            return containsNonBST(student, node.right);
        }

        public boolean isEmpty() {
            return root == null;
        }

        public String toString() {
            ArrayList<Student> list = new ArrayList<>();
            toString(root, list);
            return list.toString();
        }

        private void toString(BinaryNode node, ArrayList<Student> list) {
            if (node == null) {
                return;
            }
            toString(node.left, list);
            list.add(node.student);
            toString(node.right, list);
        }

        public ArrayList<Student> toArrayList() {
            ArrayList<Student> list = new ArrayList<>();
            toArrayList(root, list);
            return list;
        }

        private void toArrayList(BinaryNode node, ArrayList<Student> list) {
            if (node == null) {
                return;
            }
            toArrayList(node.left, list);
            list.add(node.student);
            toArrayList(node.right, list);
        }
    }


    public static class Student2 {
        private String name;
        private int id;
        private int grade;

        public Student2(String name, int id, int grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Student { " +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", grade=" + grade +
                    " }\n";
        }
    }
    public static   class BinarySearchTree8 {
        private class BinaryNode {
            Student2 data;
            BinaryNode left;
            BinaryNode right;

            public BinaryNode(Student2 data) {
                this.data = data;
            }
        }

        private BinaryNode root;
        private int comparisons;
        private int swaps;

        public int getHeight() {
            return getHeight(root);
        }

        private int getHeight(BinaryNode node) {
            if (node == null) {
                return -1;
            }
            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);
            return 1 + Math.max(leftHeight, rightHeight);
        }

        public int getSize() {
            return getSize(root);
        }

        private int getSize(BinaryNode node) {
            if (node == null) {
                return 0;
            }
            return 1 + getSize(node.left) + getSize(node.right);
        }

        public boolean contains(Student2 student) {
            return contains(root, student);
        }

        private boolean contains(BinaryNode node, Student2 student) {
            if (node == null) {
                return false;
            }
            comparisons++;
            if (node.data.getId() == student.getId()) {
                return true;
            } else if (node.data.getId() > student.getId()) {
                return contains(node.left, student);
            } else {
                return contains(node.right, student);
            }
        }

        public boolean isEmpty() {
            return root == null;
        }

        @Override
        public String toString() {
            return toString(root);
        }

        private String toString(BinaryNode node) {
            if (node == null)
                return "";

            toString(node.left);
            toString(node.right);
            return node.data.toString();
        }

        public ArrayList<Student2> toArrayList() {
            ArrayList<Student2> list = new ArrayList<>();
            toArrayList(root, list);
            return list;
        }

        private void toArrayList(BinaryNode node, ArrayList<Student2> list) {
            if (node == null) {
                return;
            }
            toArrayList(node.left, list);
            list.add(node.data);
            toArrayList(node.right, list);
        }

        public void insert(Student2 student) {
            root = insert(root, student);
        }

        private BinaryNode insert(BinaryNode node, Student2 student) {
            if (node == null) {
                return new BinaryNode(student);
            }
            comparisons++;
            if (node.data.getId() > student.getId()) {
                swaps++;
                node.left = insert(node.left, student);
            } else if (node.data.getId() < student.getId()) {
                swaps++;
                node.right = insert(node.right, student);
            }
            return node;
        }

    }



}
