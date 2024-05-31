package Repeated.SimpleSorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {100,333,50,10,3,5};
        System.out.println(Arrays.toString(arr));

        BubbleSort sort = new BubbleSort();
        sort.selectionS(arr,arr.length);

        System.out.println(Arrays.toString(arr));
        System.out.println("___________________________________");





    }
}