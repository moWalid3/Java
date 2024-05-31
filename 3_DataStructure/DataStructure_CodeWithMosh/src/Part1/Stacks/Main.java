package Part1.Stacks;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
