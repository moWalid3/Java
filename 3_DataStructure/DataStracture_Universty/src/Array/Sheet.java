package Array;
import java.util.Random;
public class Sheet {
    public static int findReap1(int[] arr){
        int counter=0;
        int value=0;
        for(int ele:arr){
            counter=0;
            for(int ele2:arr){
                if (ele==ele2)
                    counter++;
            }
            if (counter==2) {
                value=ele;
                break;
            }
        }
        return counter==2? value :-1;
    }
    public static int findReap5(int[] arr){
        int counter=0;
        int value=0;
        for(int ele:arr){
            counter=0;
            for(int ele2:arr){
                if (ele==ele2)
                    counter++;
            }
            if (counter==5) {
                value=ele;
                break;
            }
        }
        return counter==5? value :-1;
    }

    public static void main(String[] args) {
        System.out.println(findReap1(new int[]{3, 33, 223, 45, 4,  2}));
        System.out.println(findReap5(new int[]{3, 33, 223, 45, 4, 33, 33, 33, 33,2}));
    }

    //----------------------------------------------------------------------------
    // للي المعيد بعتو

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */





    /**
     *
     * @author Abdelrahman
     */
    public class ArrayEx {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
//        int [][][] r1 = new int[][][]{{{1,2},{3,4}} , {{5,6},{7,8}}};
//        int [][][] r2 = new int[][][]{{{1,2},{3,4}} , {{5,6},{7,8}}};
//        add3DArrays(r1, r2);

            System.out.println(findRepeatedItem(new int[]{1,2,4,5,3,2}));
        }
        static void removeElements(int[] array) {
            Random r = new Random();
            while (array.length > 0) {
                int index = r.nextInt(array.length);
                System.out.println("INDEX = " + index + ", ELEMENT = " + array[index]);
                int[] array1 = new int[array.length - 1];
                for (int i = 0; i < index; i++) {
                    array1[i] = array[i];
                }
                for (int i = index+1; i < array.length; i++) {
                    array1[i-1] = array[i];
                }
                for (int i = 0; i < array1.length; i++) {
                    System.out.print(array1[i]+"\t");
                }
                System.out.println("");
                array = array1;
            }
        }


        static void add3DArrays(int [][][] r1, int [][][] r2){
            int d1 = 2;
            int d2 = 2;
            int d3 = 2;
            for (int i = 0; i < d1; i++) {
                for (int j = 0; j < d2; j++) {
                    for (int k = 0; k < d3; k++) {
                        System.out.println(r1[i][j][k] + r2[i][j][k]);
                    }
                }
            }
        }

        static int findRepeatedItem(int [] arr){
            boolean [] checked = new boolean[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if(checked[arr[i]]){
                    return arr[i];
                }else{
                    checked[arr[i]] = true;
                }
            }
            return -1;
        }

    }
}
