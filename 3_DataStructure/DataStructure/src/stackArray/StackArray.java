package stackArray;

public class StackArray {
    private int []stack;
    private int top;
    private int maxSize;

    public StackArray(int maxSize) {
        this.maxSize=maxSize;
        this.stack=new int[maxSize];
        this.top=-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == (maxSize - 1);
    }
    public void push(int ele){
        if (isFull())
            System.out.println("pro your stack is full..!! ");
        else
            stack[++top]=ele;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("pro your stack is empty ...!!");
            return -1;
        }
        else {
            return stack[top--];
        }
    }
    public void printAll(){
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]+" , ");
        }
        System.out.println();
    }
    // Examples....
    public String infixToPostfix(String word){
        if (word.length()==0)
            return word;
        if (word.charAt(0)>= '0'&&word.charAt(0)<=('9'))
            return word.charAt(0)+infixToPostfix(word.substring(1));
        return "";
        // contain on video number 20 in stack ...
    }
}








