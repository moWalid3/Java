package Repeated.SimpleSorting;

public class InsertionSort {

    public void insertionSort(int[] arr, int size) {

        int item;

        for (int i = 1; i < size; i++) {

            item = arr[i];

            int j = i - 1;

            while ( j != -1  && arr[j] > item ){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = item;
        }

    }

}
