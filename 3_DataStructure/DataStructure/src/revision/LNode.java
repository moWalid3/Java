package revision;

public class LNode {
    private int data;
    private LNode next;

    public LNode(int data) {
        this.data=data;
        this.next=null;
    }

    public LNode(int data, LNode next) {
        this.data=data;
        this.next = next;
    }
    public LNode(){

    }
    public void setData(int data){
        this.data=data;
    }

    public void setNext(LNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public LNode getNext() {
        return next;
    }
}
