package T_Generics.Class_Generics;

public class GenericClassOne <T> {
    T value;

    GenericClassOne(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
