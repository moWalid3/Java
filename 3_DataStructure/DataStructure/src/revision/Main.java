package revision;

public class Main {
    public static void main(String[] args) {
        LL lili=new LL();
        lili.addToEnd(11);
        lili.print();
        lili.addToFront(22);
        lili.print();
        lili.addToFront(122);
        lili.print();
        lili.addToEnd(888);
        lili.print();
        lili.remove(888);
        lili.print();
        lili.removeFromEnd();
        lili.print();

        lili.removeFromEnd();
        lili.print();
    }
}
