package Assignments;

import java.util.Arrays;

public class Assignment3 {
    /*
    Write a mergeList method that receives two Sorted List objects as arguments, and merges them into one SortedList.

    Write a java application program to test method merge.
     */
    public static int[] mergeList(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArr;
    }

    // testing mergeList method
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] mergedArr = mergeList(arr1, arr2);
        System.out.println(Arrays.toString(mergedArr)); 
    }
}
