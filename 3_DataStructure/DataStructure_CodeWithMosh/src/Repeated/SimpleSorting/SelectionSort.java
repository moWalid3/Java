package Repeated.SimpleSorting;

public class SelectionSort {
    public void selectionSort(int [] arr,int size){

        int max;

        for (int i = 0; i < size; i++) {
            max = 0;

            for (int j = 0; j < size - i - 1; j++)
                if (arr[j + 1] > arr[max] )
                    max = j+1;


            int temp = arr[max];
            arr[max] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }

    }


}
