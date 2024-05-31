package stackLList;

public class StackLList {
    // هتكون مكان ال head
    private StackNode top;
    StackLList(){
        this.top=null;
    }
    public  boolean isEmpty(){
        return top==null;
    }
    public void push(int data){
        /*
        if (isEmpty()) {
            top = new StackNode(data);
        }else {
            top= new StackNode(data, top.next);
        }
         */
        top=new StackNode(data,top);
    }
    public void pop(){
        if (isEmpty())
            System.out.println("pro your stack is empty....");
        else
            top=top.next;
    }
    public int printTop(){
        return top.data;
    }
}
