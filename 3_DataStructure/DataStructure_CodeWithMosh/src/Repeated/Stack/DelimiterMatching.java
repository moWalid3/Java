package Repeated.Stack;
class BracketChecker {
    private String input;
    public BracketChecker(String in)
    { input = in; }

    public void check() {

        int stackSize = input.length();
        StackXX theStack = new StackXX(stackSize);

        for (int j = 0; j < input.length(); j++) {

            char ch = input.charAt(j);

            switch (ch) {
                case '{', '[', '(' -> theStack.push(ch);

                case '}', ']', ')' -> {
                    if (!theStack.isEmpty()) {

                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '('))
                            System.out.println("Error: " + ch + " at " + j);

                    } else
                        System.out.println("Error: " + ch + " at " + j);
                }

                default -> {

                }
            }
        }

        if( !theStack.isEmpty() )
            System.out.println("Error: missing right delimiter");

    }
}
class StackXX {
    private int maxSize;
    private char[] stackArray;
    private int top;
    //--------------------------------------------------------------
    public StackXX(int s) // constructor
    {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    public void push(char j)
    {
        stackArray[++top] = j;
    }
    //--------------------------------------------------------------
    public char pop()
    {
        return stackArray[top--];
    }
    //--------------------------------------------------------------
    public char peek()
    {
        return stackArray[top];
    }
    //--------------------------------------------------------------
    public boolean isEmpty()
    {
        return (top == -1);
    }
    //--------------------------------------------------------------
}


class app{
    public static void main(String[] args) {
        BracketChecker bracketChecker=new BracketChecker("ali{(}{(()}mal{})()");
        bracketChecker.check();
    }
}

