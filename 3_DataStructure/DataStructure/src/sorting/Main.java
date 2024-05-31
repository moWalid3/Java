package sorting;

public class Main {
    // from small to big ....
    public static void insertionSort(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp=arr[i];
            j=i-1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    // from big to small ....
    public static void insertionSort2(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp=arr[i];
            j=i-1;
            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i+1); j++) {
                if (arr[j] > arr[j + 1]) {;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        int mid;
        if (start < end ){
            mid = (start + end) / 2;
            mergeSort(arr,start,mid);
            mergeSort(arr, mid + 1, end);
            merge(arr,start,mid+1,end);
        }
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int [] arr2 = new int[arr.length];
        int i, j, k;
        i=k=p;
        j=q;
        while ((i <= q - 1) && (j <= r)) {
            if (arr[i] <= arr[j])
                arr2[k++] = arr[i++];
            else
                arr2[k++] = arr[j++];
        }
        while (i <= q - 1) {
            arr2[k++]=arr[i++];
        }
        while (j <= r) {
            arr2[k++]=arr[j++];
        }
        for (int n = p; n <= r; n++) {
            arr[n]=arr2[n];             // sorting all elements of temporary array arr2 .
                                        // in original array arr .
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {33, 11, 1, 2, 55, 6, 22, 4, 56};
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }


    }
}
