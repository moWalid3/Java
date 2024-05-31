package Part1.Stacks;
/*
* On this algorithm I use top1 is even counter and top2 is odd counter,
* but you can create this with another answer -> top1 is 0 and top2 is max
* */
public class TowStacks {
    private int [] items;
    private int top1;
    private int top2;
    TowStacks (int max){
        this.items = new int[max];
        this.top1 = 0; // even
        this.top2 = 1; // odd
    }

    public void push1(int item){
        if (isFull1())
            throw new StackOverflowError();

        items[top1] = item;
        top1 += 2;
    }
    public int pop1(){
        if (isEmpty1())
            throw new IllegalStateException();

        top1-=2;
        return items[top1];
    }
    public boolean isEmpty1(){
        return top1 == 0;
    }
    public boolean isFull1(){
        return top1 == items.length ;
    }
    public void push2(int item){
        if (isFull2())
            throw new StackOverflowError();

        items[top2] = item;
        top2 += 2;
    }
    public int pop2(){
        if (isEmpty2())
            throw new IllegalStateException();

        top2-=2;
        return items[top2];
    }
    public boolean isEmpty2(){
        return top2 == 1;
    }
    public boolean isFull2(){
        return top2 == items.length + 1;
    }
}
