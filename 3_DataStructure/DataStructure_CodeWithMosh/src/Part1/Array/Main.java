package Part1.Array;


public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);

        numbers.print();

        System.out.println("----------------------");
        numbers.intersect(numbers).print();
        System.out.println("----------------------");
        //numbers.reverse();
        numbers.insertAt(2,25);
        numbers.print();

    }
}