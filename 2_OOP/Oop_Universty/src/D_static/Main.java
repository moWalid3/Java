package D_static;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(Car.count);

        // this is the best case with count be private and use it, but I'll show you (you access static by class name)
        System.out.println(Car.printCount());

        /*  static:
        *   - one value in all objects of this class (even you change it in any object ==> all other objects are changed)
        *   - when you access it ==> use class name directly (not object name)
        *
        * */
    }

}
