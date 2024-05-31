package J_interface_vs_abstractClass;
class Main {

    // is-a
    // you want to define state non-static and non-final
    public abstract class Animal {
        abstract void walk();
    }

    // has-a
    // var ==> public static final (as default)
    interface Animall {
        abstract void walk();
    }

}