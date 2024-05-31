package LList;

public class LinkedListt {
    public Link first;

    public LinkedListt() {
        first=null;
    }
    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next=first;
        first=newLink;
    }
    public Link deleteFirst(){
        Link temp = first;
        first=first.next;
        return temp;
    }
    public void displayList(){
        System.out.print("List : ");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }
    public Link find(int data){
        Link helpPointer = first;
        while (helpPointer.data != data) {
            if (helpPointer.next==null)
                return null;
            else
                helpPointer=helpPointer.next;
        }
        return helpPointer;
    }

    // -------------------------------------------------------------
    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while(current.data != key)
        {
            if(current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if(current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }
    //----------------------------------------------------------------

}
class  LinkListApp
{
    public static void main(String[] args)
    {
        LinkedListt theList = new LinkedListt();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.displayList();
        while( !theList.isEmpty() )
        {
            Link aLink = theList.deleteFirst();
            System.out.print("deleted: ");
            aLink.displayLink();
            System.out.println();
        }
        theList.displayList();
    }
}
