package Stack.Chapter;



public class StackX {
    private long []arr;
    private int top;
    public StackX(int max){
        this.arr=new long[max];
        this.top=-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == arr.length-1;
    }

    public void posh(long data) {
        if (isFull())
            return;
        arr[++top]=data;
    }
    public void peek(){
        System.out.println(arr[top]);
    }
    public void pop(){
        if (isEmpty()) {
            System.out.println("pro this stack is empty!!!");
            return;
        }
        System.out.println(arr[top--]);
    }
    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static class AppStackX {
        public static void main(String[] args) {
            StackX arr = new StackX(100);
            arr.posh(33);
            arr.posh(65);
            arr.posh(464);
            arr.posh(763);
            arr.posh(22);
            arr.display();
            arr.pop();
            arr.display();
            arr.posh(464);
            arr.posh(763);
            arr.display();
            arr.pop();arr.pop();arr.pop();arr.pop();
            arr.display();
            arr.posh(44444);
            arr.posh(22222);
            arr.display();
        }
    }
}
