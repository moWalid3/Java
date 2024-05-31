package Repeated.Stack;



public class Reversing_A_Word {
    public static void main(String[] args) {

        System.out.println(reversingWord("mohamedahmed"));

    }
    public static String reversingWord(String word){
        int size = word.length();
        StackChar stack = new StackChar(size);

        for(char ch : word.toCharArray())
            stack.push(ch);

        String value = "";

       while(!stack.isEmpty())
            value = value + stack.pop();

        return value;
    }
}
