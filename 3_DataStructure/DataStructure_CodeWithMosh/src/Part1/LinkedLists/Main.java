package Part1.LinkedLists;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        System.out.println(Arrays.toString(list.toArray()));
        list.printMiddle();

        System.out.println(list.getKthFromTheEnd(2));

        LinkedList list2 = LinkedList.createWithLoop();
        System.out.println(list2.hasLoop());

    }
}
