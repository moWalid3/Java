package Repeated.Stack;

public class Main {
    public static void main(String[] args) {
        StackX st = new StackX(10);

        st.push(30);
        st.push(40);
        st.push(20);
        st.push(10);

        st.displayStack();
        System.out.println(st.pop());
        System.out.println(st.peek());

        st.displayStack();

    }
}
