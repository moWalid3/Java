package Repeated.Array;

public class Array {
    private int [] items;
    private int size;
    public Array(int max) {
        this.items = new int[max];
    }
    public void insert(int item) {
        resizeIfRequired();
        items[size++] = item;
    }
    public void insertAt(int index, int item) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException();

        resizeIfRequired();

        for (int i = size; i > index; i--)
            items[i] = items[i - 1];

        items[index] = item;
        size++;
    }
    public void resizeIfRequired(){
        if (size == items.length) {
            int [] arr = new int [size * 2];
            System.arraycopy(items, 0, arr, 0, size);
            items = arr;
        }
    }
    public int indexOf(int item){
        for (int i = 0; i < size; i++)
            if (items[i] == item)
                return i;

        return -1;
    }
    public int removeAt(int index){
        if (size == 0)
            throw new IllegalStateException();

        if (index < 0 || index >= size)
            throw new IllegalArgumentException();

        int item = items[index];
        for (int i = index; i < size; i++)
            items[i] = items[i+1];

        size--;
        return item;
    }
    public int remove(){
        if (size == 0)
            throw new IllegalStateException();

        return items[--size];
    }
    public int peek(){
        return items[size];
    }
    public void print(){
        for (int i = 0; i < size; i++)
            System.out.print(items[i]+",  ");
        System.out.println();
    }
    public int maximum(){
        int max = items[0];
        for (int i = 1; i < size; i++)
            max = Math.max(max,items[i]);

        return max;
    }
    public Array intersect(Array other){
        Array  intersection = new Array(size);
        for (int i = 0; i < size; i++)
            if (other.indexOf(items[i]) >= 0)
                intersection.insert(items[i]);

        return intersection;
    }
    public void reverse(){
        int [] itemsReverse = new int[items.length];

        for (int i = 0; i < size; i++)
            itemsReverse[size - i - 1] = items[i];

        items = itemsReverse;
    }
}
