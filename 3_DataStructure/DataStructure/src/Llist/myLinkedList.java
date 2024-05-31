package Llist;

public class myLinkedList {
    LLnode head=null;


    public boolean isEmpty(){
        return head==null;
    }
    public int  search(int data){
        if (head != null) {
            LLnode helpPointer = head;
            int counter = 0;
            while (helpPointer != null) {
                if (helpPointer.data == data)
                    return counter;
                helpPointer = helpPointer.next;
                counter++;
            }
        }
        return -1;
    }
    public void printAll(){
        LLnode helpPointer=head;
        while (helpPointer != null) {
            System.out.println(helpPointer.data);
            helpPointer=helpPointer.next;
        }
    }
    public void insertAtFront(int data){
        LLnode newNode=new LLnode(data);
        if (head == null)
            head=newNode;
        else {
            newNode=head;
            head = newNode;
        }
    }
    public void insertAtEnd(int data){
        LLnode newNode = new LLnode(data);
        if (head==null){
            head=newNode;
        }else {
            LLnode helpPointer = head;
            while (helpPointer.next != null) {
                helpPointer = helpPointer.next;
            }
            helpPointer.next = newNode;
        }
    }
    public void addToSortedLL(int data){
        if (head ==null)
            head=new LLnode(data);
        else{
            LLnode helpPointer=head;
            while (helpPointer.next!=null){
                if (helpPointer.next.data>data)
                    break;
                helpPointer=helpPointer.next;
            }
            helpPointer.next=new LLnode(data,helpPointer.next);
        }
    }
    public void deleteFromSortedLL(int data){
        if (!isEmpty()){
            if (head.data == data)
                head=head.next;
            else {
                LLnode helpPointer =head;
                while (helpPointer.next != null) {
                    if (helpPointer.next.data == data) {
                        helpPointer.next=helpPointer.next.next;
                        break;
                    }
                    helpPointer=helpPointer.next;
                }
            }
        }
    }
    public int count(){
        if (isEmpty()){
            return 0;
        }
        else {
            LLnode helpPointer = head;
            int counter = 0;
            while (helpPointer != null) {
                counter++;
                helpPointer = helpPointer.next;
            }
            return counter;
        }
    }
    public void printEvenNodes(){
        if (isEmpty())
            System.out.println("your node is empty pro ...!");
        else {
            boolean test = false;
            int even=0;
            int all=count();
            LLnode helpPointer = head;
            while (helpPointer != null) {
                if (helpPointer.data % 2 == 0) {
                    System.out.println(helpPointer.data);
                    even++;
                    test = true;
                }
                helpPointer = helpPointer.next;
            }
            System.out.println("the number of node even : "+even+"\nthe number of node odd : "+(all-even));
            if (!test)
                System.out.println("not nodes data's is even ...");
        }
    }
    public void swapFirstLast(){
        if (isEmpty())
            System.out.println("pro your linked list is empty !! ");
        else if (head.next==null)
            System.out.println("pro your linked list have one node !!");
        else if (count()==2){
            LLnode temp=head;
            LLnode helpPointer=head.next;
            helpPointer.next=temp;
            head=head.next;
            temp.next=null;

        } else {
            LLnode helpPointer =head;
            while (helpPointer.next.next!= null){
                helpPointer=helpPointer.next;
            }
            LLnode temp = head;
            helpPointer.next.next=head.next;
            head=helpPointer.next;
            helpPointer.next=temp;
            temp.next=null;


        }
    }
    public void addNodeAfter(int data) {
        if (isEmpty()){
            System.out.println("pro your node is empty ..!");
        }else {
            if (search(data)==-1)
                System.out.println("this data is not find ..!");
            else {
                LLnode newNode = new LLnode(data * 2);
                LLnode helpPointer = head;
                while (helpPointer != null) {
                    if (helpPointer.data == data) {
                        newNode.next = helpPointer.next;
                        helpPointer.next = newNode;
                    }
                    helpPointer = helpPointer.next;
                }
            }
        }

    }
    public void deleteNodeAfter(int data){
        if (search(data)==-1){
            System.out.println("your data is not find...!");
        }else {
            LLnode helpPointer =head;
            while (helpPointer != null) {
                if (helpPointer.data == data) {
                    helpPointer.next=helpPointer.next.next;
                }
                helpPointer=helpPointer.next;
            }
        }
    }
    public int findLargest(){
        if (isEmpty()){
            System.out.println("pro your linked list is empty...!");
            return -1;
        }else {
            LLnode helpPointer=head;
            LLnode result=head;
            while (helpPointer.next != null) {
                if (helpPointer.next.data > result.data) {
                    result=helpPointer.next;
                }
                helpPointer=helpPointer.next;
            }
            return result.data;
        }
    }
    public void deleteEndNode(){
        if (isEmpty()) {
            System.out.println("pro your Linked list is empty...");
        }else {
            LLnode helpPointer =head;
            while (helpPointer.next.next != null) {
                helpPointer=helpPointer.next;
            }
            helpPointer.next=null;
        }
    }

}
