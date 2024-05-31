package T_Generics.Method_Generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        Double[] doubleArr = {1.3, 2.5, 3.9};
        Character[] charArr = {'a', 'b', 'c'};
        String[] stringArr = {"Ali", "Omar", "Ahmed"};

        getValues(intArr);
        getValues(doubleArr);
        getValues(charArr);
        getValues(stringArr);
    }

    public static <T> void getValues(T[] arr) {
        for (T ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
