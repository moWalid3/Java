package Array;

public class Main {
    public static void main(String[] args) {
        MyArray a1=new MyArray(3);
        a1.insert(4);
        a1.insert(6);
        a1.insert(1);
        a1.display();
        a1.delete(4);
        a1.display();
    }
}