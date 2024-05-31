package T_Generics.Class_Generics;

public class Main {
    public static void main(String[] args) {
        GenericClassOne<Integer> gen1 = new GenericClassOne<>(3);
        GenericClassOne<Double> gen2 = new GenericClassOne<>(9.8);
        GenericClassOne<Character> gen3 = new GenericClassOne<>('A');
        GenericClassOne<String> gen4 = new GenericClassOne<>("Mohamed");

        System.out.println(gen1.getValue());
        System.out.println(gen2.getValue());
        System.out.println(gen3.getValue());
        System.out.println(gen4.getValue());
        //-------------------------------------------------------------------

        GenericClassTwo<String, Integer> g1 = new GenericClassTwo<>("Ali", 99);
        GenericClassTwo<Double, Character> g2 = new GenericClassTwo<>(88.32, 'i');

        System.out.println(g1.getVal1() + " " + g1.getVal2());
        System.out.println(g2.getVal1() + " " + g2.getVal2());
    }
}
