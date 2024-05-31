package Llist;

public class LLnode {
     int data;
     LLnode next;
     public LLnode(int data){
         this.data=data;
         this.next =null;
     }

    public LLnode(int data, LLnode next) {
        this.data=data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public LLnode getNext() {
        return next;
    }
}
