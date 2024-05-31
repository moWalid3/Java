package Repeated.Stack;

public class StackX {
    int [] items ;
    int size;
    int top;

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return size == items.length;
    }
    public StackX (int max){
        this.items = new int[max];
        size = 0;
        top = -1;
    }

    public void push(int item){
        items[size++] = item;
        top++;
    }
    public int pop(){
        int item = items[top--];
        size--;
        return item;
    }
    public int peek(){
        return items[top];
    }
    public void displayStack(){
        for (int i = 0; i < size; i++)
            System.out.print(items[i]+",  ");

        System.out.println();
    }


}
