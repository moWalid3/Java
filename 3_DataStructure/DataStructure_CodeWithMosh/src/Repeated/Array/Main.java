package Repeated.Array;

public class Main {
    public static void main(String[] args) {
        Array items = new Array(10);
        items.insert(10);
        items.insert(20);
        items.insert(30);
        items.insert(40);
        items.insert(50);

        Array items2 = new Array(10);
        items2.insert(10);
        items2.insert(20);
        items2.insert(30);
        items2.insert(60);
        items2.insert(50);

        items.print();
        items2.print();

        System.out.println("---------------------------------");
        Array intersection = items.intersect(items2);
        intersection.print();




    }
}
