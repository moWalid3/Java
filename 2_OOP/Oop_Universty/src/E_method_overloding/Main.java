package E_method_overloding;

public class Main {
    /*
        overloading:
        ----------
        - the same method name and different parameters
        - the return type does not affect
     */
    public static void show(String string) {
        System.out.println(string);
    }
    public static void show(int num) {
        System.out.println(num);
    }
    public static char show (char ch) {
        return ch;
    }
    public static int show (char ch,int num) {
        return num;
    }
    public static int show(int num, char ch) {
        return num;
    }


    public static void main(String[] args) {

        show("ali");
        show(8888);

        System.out.println(show('M'));

    }
}
