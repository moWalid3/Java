package Project;
import java.util.ArrayList;

public class Project15 {
    public static class Student{
        int id;
        int grade;
        String name;

        public Student(int id, int grade, String name) {
            this.id = id;
            this.grade=grade;
            this.name=name;
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
    public static class Node{
        Student student;
        Node left;
        Node right;

        public Node(Student student) {
            this.student=student;
        }
    }
    public static class BST{
        Node root;

        public BST(){
            this.root = null;
        }

        public void insert(Student student) {
            Node newNode = new Node(student);
            root = insert(root, newNode);
        }

        private Node insert(Node currentParent, Node newNode) {

            if (currentParent == null)
                return newNode;

            if (newNode.student.grade > currentParent.student.grade)
                currentParent.right = insert(currentParent.right, newNode);
            else if (newNode.student.grade < currentParent.student.grade)
                currentParent.left = insert(currentParent.left, newNode);

            return currentParent;
        }

        public int height() {
            return height(root);
        }

        private int height(Node root) {
            if (root == null)
                return -1;

            if (isLeaf(root))
                return 0;

            return 1 + Math.max(
                    height(root.left),
                    height(root.right));
        }

        private boolean isLeaf(Node node) {
            return node.left == null && node.right == null;
        }

        public int size() {
            return size(root);
        }

        private int size(Node root) {
            if (root == null)
                return 0;

            if (isLeaf(root))
                return 1;

            return 1 + size(root.left) + size(root.right);
        }

        public boolean containsNonBST(Student student) {
            return containsNonBST(root, student.grade);
        }

        private boolean containsNonBST(Node root, int grade) {
            if (root == null)
                return false;

            if (root.student.grade == grade)
                return true;

            return containsNonBST(root.left, grade) || containsNonBST(root.right, grade);
        }

        public boolean isEmpty() {
            return root == null;
        }

        @Override
        public   String toString() {
            Node currentParent = root;
            return toString(currentParent);
        }

        public  String toString(Node currentParent) {
            if (currentParent == null)
                return "";
            return toString(currentParent.left) + currentParent.student.toString() + toString(currentParent.right);
        }

        public ArrayList<Student> toArrayList() {
            Node currentParent = root;
            ArrayList<Student> students = new ArrayList<>();
            toArrayList(currentParent,students);
            return students;
        }

        public void toArrayList(Node currentParent,ArrayList<Student> students) {
            if (currentParent == null)
                return ;

            toArrayList(currentParent.left,students);
            students.add(currentParent.student);
            toArrayList(currentParent.right,students);
        }

    }

    public static void main(String[] args) {
        BST bst = new BST();

        Student stu1 = new Student(1,100,"Zayn");
        Student stu2 = new Student(2,140,"Jafar");
        Student stu3 = new Student(3,193,"Baha");
        Student stu4 = new Student(4,55,"Abbas");
        Student stu5 = new Student(5,72,"Farouk");
        Student stu6 = new Student(6,111,"Habib");
        Student stu7 = new Student(7,88,"Adel");
        Student stu8 = new Student(8,144,"Majid");
        Student stu9 = new Student(9,61,"Sami");
        Student stu10 = new Student(10,20,"Karim");

        bst.insert(stu1);
        bst.insert(stu2);
        bst.insert(stu3);
        bst.insert(stu4);
        bst.insert(stu5);
        bst.insert(stu6);
        bst.insert(stu7);
        bst.insert(stu8);
        bst.insert(stu9);
        bst.insert(stu10);

     //   System.out.println(bst.toString());

        System.out.println("-----------------------------");
        System.out.println("height -->  "+ bst.height());
        System.out.println("size -->   " + bst.size());
        System.out.println("contains -->   " +bst.containsNonBST(new Student(9,61,"Sami")));
        System.out.println("isEmpty -->   " + bst.isEmpty());
        System.out.println("-----------------------------");

        for (Student stu : bst.toArrayList()) {
            System.out.print(stu.toString());
        }

    }
}
