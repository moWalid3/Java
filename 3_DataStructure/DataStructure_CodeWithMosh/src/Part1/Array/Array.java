package Part1.Array;

public class Array {
    private int [] items;
    private int size;
    public Array(int length ){
        this.items=new int[length];
        this.size = 0;
    }
    public void insert(int item){
        resizeIfRequired();

        items[size++]=item;
    }
    public void insertAt(int index,int item){
        if (index < 0 || index > size)
            throw new IllegalArgumentException();

        resizeIfRequired();

        for (int i = size; i > index ; i--)
            items[i] = items[i - 1];

        items[index] = item;
        size++;
    }
    private void resizeIfRequired(){
        // This also made our code cleaner and more readable.
        if (items.length == size) {
            int[] newItems = new int[size + 10];

            for (int i = 0; i < size; i++)
                newItems[i]=items[i];

            items = newItems;
        }
    }
    public int indexOf(int item){
        for (int i = 0; i < size; i++)

            if (items[i]==item)
                return i;

        return -1;
    }
    public void removeAt(int index){
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();

        for (int i = index; i < size; i++)
            items[i]=items[i+1];

        size--;
    }
    public void print(){
        for (int i = 0; i < size; i++)
            System.out.println(items[i]);
    }
    public int maximum(){
    // runtime complexity -> O(n)
        int max = items[0];

        for (int i = 1; i < size; i++)
            max=Math.max(items[i],max);

        return max;
    }
    public Array intersect(Array other) {
        Array intersection = new Array(size);
        for (int i = 0; i < size; i++)
            if (other.indexOf(items[i]) >= 0)
                intersection.insert(items[i]);

        return intersection;
    }
    public void reverse(){
        int [] newItems = new int[size];

        for (int i = 0; i < size; i++)
            newItems[i] = items[size - i - 1];

        items=newItems;
    }

}
