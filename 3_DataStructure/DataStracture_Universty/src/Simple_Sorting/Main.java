package Simple_Sorting;

import java.util.Arrays;

public class Main {

    public static void bubbleSort(int []arr,int nElms){
        for (int i = nElms-1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void bubbleSortImproved(int []arr,int nELms){
        boolean check;
        for (int i = nELms - 1; i > 0; i--) {
            check=false;
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check=true;
                }
            }
            if (!check)
                break;
        }
    }

//------------------------------------------------------------------
    public static void selectionSort(int [] arr, int n){
        int min;
        for (int i = 0; i < n - 1; i++) {
            min=i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min=j;
                }
            }
            // swap
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

//------------------------------------------------------------------
    public static void insertionSort(int[] arr, int nElms) {
        int in;
        for (int i = 1; i < nElms; i++) {
            int temp=arr[i];
            in=i;
            while (in > 0 && arr[in-1] >= temp) {
                arr[in]=arr[in-1];
                in--;
            }
            arr[in]=temp;
        }
    }
    public static void InsertionSortString(String[] arr, int nElms) {
        int in;
        for (int i = 1; i < nElms; i++) {
            String temp=arr[i];
            in=i;
            while (in > 0 && arr[in-1].compareTo(temp) > 0) {
                arr[in]=arr[in-1];
                in--;
            }
            arr[in]=temp;
        }
    }

    //-----------------------------------------------------------------
    public static void bucketSort(int[] arr, int nElms) {
        
    }

//-----------------------------------------------------------------

    public static void main(String[] args) {


        String[] ar = {"yousef","ali", "mohamed","cll", "ahmed","def", "hamza", "osman","ab"};
        int nElms=ar.length;
        System.out.println(Arrays.toString(ar));
        InsertionSortString(ar, nElms);
        System.out.println(Arrays.toString(ar));
        System.out.println("****************************");
        int []arr= new int[10];
        arr[0]=98;
        arr[1]=86;
        arr[2]=5;
        arr[3]=33;
        arr[4]=22;
        arr[5]=11;
        int n=6;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSortImproved(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        


    }
}
