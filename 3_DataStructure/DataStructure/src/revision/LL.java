package revision;

public class LL {
    private LNode head;


    public LL(){

    }
    public LL(LNode head){
        this.head=head;
    }
    public void setHead(LNode head) {
        this.head = head;
    }
    public LNode getHead() {
        return head;
    }
    // method ............
    public boolean isEmpty(){
        return head == null;
    }
    public void addToFront(int data){
        head= new LNode(data, head);
    }
    public void addToEnd(int data){
        if (isEmpty()) {
            addToFront(data);
        }else {
            LNode newNode = new LNode(data);
            LNode helpPointer = head;
            while (helpPointer.getNext() != null) {
                helpPointer = helpPointer.getNext();
            }
            helpPointer.setNext(newNode);
        }
    }
    public void print (){
        LNode helpPointer =head;
        while (helpPointer != null) {
            System.out.print(helpPointer.getData() + " , ");
            helpPointer=helpPointer.getNext();
        }
        System.out.println();
    }
    public void removeFromEnd(){
        if (isEmpty()) {
            System.out.println("Error : pro your linked list is empty pro ..!!");
        } else if (head.getNext() == null) {
            head=null;
        } else {
            LNode helpPointer = head;
            while (helpPointer.getNext().getNext() != null) {
                helpPointer = helpPointer.getNext();
            }
            helpPointer.setNext(null);
        }
    }
    public boolean isFind(int data){
        LNode helpPointer =head;
        while (helpPointer != null) {
            if (helpPointer.getData() == data)
                return true;
            helpPointer=helpPointer.getNext();
        }
        return false;
    }

    public void remove(int data){
        if (isFind(data)){
            LNode helpPointer =head;
            while (helpPointer.getNext() != null) {
                if (helpPointer.getNext().getData()==data){
                    helpPointer.setNext(helpPointer.getNext().getNext());
                    break;
                }
                helpPointer=helpPointer.getNext();
            }
        }else
            System.out.println("Error : this data is not found it ...!!");
    }




}
