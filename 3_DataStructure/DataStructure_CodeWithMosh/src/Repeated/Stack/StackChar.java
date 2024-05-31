package Repeated.Stack;

public class StackChar {
    int top ;
    char [] items;
    public StackChar (int max){
        items = new char[max];
        top = -1;
    }
    public void push(char item){
        items[++top] = item;
    }
    public char pop(){
        return items[top--];
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
