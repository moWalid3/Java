package F_this;

public class Main {

    int num;
    char ch;

    public Main(int num, char ch) {
        // this (keyword) ==> sign to a current object
        this.num = num;
        this.ch = ch;
    }

    public static void main(String[] args) {

        Main obj = new Main(88,'a');
        // obj ==> current object ==> "this" sign to "obj"

    }
}
