package G_override;

public class Main {

    /*
        overriding rule:
        --------------
        1- private method can't override (new method)
        2- final method can't be overridden.
        3- static
                                                    -super (static method)     |      -super (non-static method)
                        - sub (static method)                hidden                        compile-time error
                        - sub (non-static method)       compile-time error                      override

        4- constructor can't be overridden
        -----------------------------------
        - I can changed method access modifier from low ex: protected to high ex: public this operation is called "elevated" or "promoted"
        - The overriding method must have the same return type or on the same chain of inheritance (subtype)
     */
    /*
     *               override              |              overloading
     *           same method name                       same method name
     *           same parameters                        different parameter
     *           in different class                     in the same class
     *       same return type or subtype                return type is not important
     * */
    abstract class Parent {
        static void method() {
            System.out.println("method parent");
        }

        Parent method2() {
            return null;
        }
    }

    class Child extends Parent {

        static void method() {
            System.out.println("method child");
        }

        @Override
        Child method2() {
            return null;
        }
    }
}
