package Simple_Sorting;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Bucket_And_Radix_Sort {
    public static void bucket_sort(int[] arr) {
        // get max value in array
        int max_value = arr[0];
        for (int ele : arr)
            if (ele > max_value)
                max_value = ele;

        int[] bucket = new int[max_value + 1];

        for (int ele : arr)
            bucket[ele]++;

        int pos = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                arr[pos++] = i;
    }
    ////////////////////////////////////////////////////////////////////////////
    /*
     * Java Program sort an integer array using radix sort algorithm.
     * input: [180, 50, 10, 30, 10, 29, 60, 0, 17, 24, 12]
     * output: [0, 10, 10, 12, 17, 24, 29, 30, 50, 60, 180]
     *
     * Time Complexity of Solution:
     *   Best Case O(k*n); Average Case O(k*n); Worst Case O(k*n),
     *   where k is the length of the longest number and n is the
     *   size of the input array.
     *
     *   Note: if k is greater than log(n) then an n*log(n) algorithm would be a
     *         better fit. In reality, we can always change the radix to make k
     *         less than log(n).
     *
     */
    public static void radixSort(int[] arr) {
        final int RADIX = 10;
        // declare and initialize bucket[]
        List<Integer> [] bucket = new ArrayList[RADIX];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // sort
        boolean maxLength = false;
        int tmp , placement = 1;
        while (!maxLength) {
            maxLength = true;

            // split input between lists
            for (Integer ele : arr) {
                tmp = ele / placement;
                bucket[tmp % RADIX].add(ele);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }

            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer ele : bucket[b]) {
                    arr[a++] = ele;
                }
                bucket[b].clear();
            }

            // move to next digit
            placement *= RADIX;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void main(String []args) {
        int[] arr ={80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50};
        System.out.println(">> Bucket sort in Java");
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After sorting: ");
        bucket_sort(arr);
        System.out.println(Arrays.toString(arr));
        //---------------------------------------------------------------------//
        System.out.println("**************************************************************");
        int[] arr2 = { 181, 51, 11, 33, 11, 39, 60, 2, 27, 24, 12 };
        System.out.println(">> Radix sort in Java");
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr2));
        radixSort(arr2);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr2));
    }
}

