package stackArray;

public class Main {
    public static void main(String[] args) {
        StackArray stackArray=new StackArray(5);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.printAll();
        System.out.println(stackArray.pop());
        stackArray.printAll();
    }
}
