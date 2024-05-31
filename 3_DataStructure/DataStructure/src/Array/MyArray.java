package Array;

import java.util.Arrays;

public class MyArray {
    private int[] arr;
    private int numEle;
    public MyArray(int size){
        this.arr = new int[size];
        this.numEle=0;
    }
    public int search(int ele){
        for (int i = 0; i < numEle; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
    public void insert(int ele){
        if (arr.length == numEle) {
            System.out.println("Error pro array is full !!");
        }else {
            arr[numEle++]=ele;
            System.out.println("successful process...");
        }
    }
    public void delete(int ele){
        if (numEle==0) {
            System.out.println("Error pro array is empty !!");
        }else {
            int check = search(ele);
            if (check == -1) {
                System.out.println("Error pro this element is not find !!!");
            } else if (check == (numEle - 1)) {
                arr[check]=0;
            } else if (check == (numEle - 2) && (numEle == arr.length)) {
                for (int i = check; i < numEle - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[numEle-1] =0;
                numEle--;
            } else {
                for (int i = check; i < numEle - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                numEle--;
            }
            System.out.println("successful process...");
        }
    }
    public void display(){
        System.out.println(Arrays.toString(arr));
    }


}
