package U_Lambda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali 99");
        list.add("Mostafa 88");
        list.add("Othman 77");

        // In old, before lambda expression
        list.forEach(new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("-------------------------------------------------------");

        // by lambda expression
        // ==> you can remove () if you have a one parameter, {} if you have a one sentence of code
        list.forEach(ele -> System.out.println(ele));

        // I don't now this operation ==> search for it
        list.forEach(System.out::println);

    }
}
