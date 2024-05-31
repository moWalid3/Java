package Part1.Stacks;
import java.util.Arrays;

public class MyStack {
    private int [] items;
    private int size;
    MyStack(int max){
        this.items = new int[max];
        this.size = 0;
    }
    public void push(int item){
        if (items.length == size) {
            int [] copyItems = new int[size * 2];
            System.arraycopy(items, 0, copyItems, 0, size);
            items = copyItems;
        }

        items[size++] = item;
    }
    public int pop(){
        if (isEmpty())
            throw new IllegalStateException();

        return items[--size];
    }
    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        return items[size-1];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items,0,size);
        return Arrays.toString(content);
    }
}
