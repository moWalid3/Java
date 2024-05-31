package Repeated.SimpleSorting;

public class BubbleSort {
    public void bubbleSort(int [] arr,int size){

        for (int i = 0; i < size; i++)

            for (int j = 0; j < size-i-1; j++)

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

    }
    public void selectionS(int [] arr, int size ){
        int min;
        for (int i = 0; i < size; i++) {
            min = i;

            for (int j = i + 1; j < size ; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

}
