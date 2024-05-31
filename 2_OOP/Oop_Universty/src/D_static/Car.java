package D_static;

public class Car {
    /*  static:
     *   - one value in all objects of this class (even you change it in any object ==> all other objects are changed)
     *   - when you access it ==> use class name directly (not object name)
     *
     * */
    static int count = 0;

    public Car () {
        count++;
    }

    public static int printCount() {
        return count;
    }
}
