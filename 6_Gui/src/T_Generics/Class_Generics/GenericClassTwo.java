package T_Generics.Class_Generics;

public class GenericClassTwo<T, V> {
    T val1;
    V val2;

    GenericClassTwo(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public V getVal2() {
        return val2;
    }
}
