package HashTable;

// hashChain.java
// demonstrates hash table with separate chaining
// to run this program: C:>java HashChainApp
import java.io.*;
////////////////////////////////////////////////////////////////
class Node
{
    private int iData;
    public Node next;
    // -------------------------------------------------------------
    public Node(int it)
    { iData= it; }
    // -------------------------------------------------------------
    public int getKey()
    { return iData; }

    public void displayNode()
    { System.out.print(iData + ""); }

}
////////////////////////////////////////////////////////////////
class SortedList
{
    private Node first;
    // -------------------------------------------------------------
    public void SortedList()
    { first = null; }
    // -------------------------------------------------------------
    public void insert(Node theNode)
    {
        int key = theNode.getKey();
        Node previous = null;
        Node current = first;

        while( current != null && key > current.getKey() )
        {
            previous = current;
            current = current.next;
        }
        if(previous==null)
            first = theNode;
        else
            previous.next = theNode;
        theNode.next = current;
    }
    // -------------------------------------------------------------
    public void delete(int key)
    {
        Node previous = null;
        Node current = first;

        while( current != null && key != current.getKey() )
        {
            previous = current;
            current = current.next;
        }

        if(previous==null)
            first = first.next;
        else
            previous.next = current.next;
    }
    // -------------------------------------------------------------
    public Node find(int key)
    {
        Node current = first;

        while(current != null && current.getKey() <= key)
        {
            if(current.getKey() == key)
                return current;
            current = current.next;
        }
        return null;
    }
    // -------------------------------------------------------------
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Node current = first;
        while(current != null)
        {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
////////////////////////////////////////////////////////////////
class MyHashTable2
{
    private SortedList[] hashArray;
    private int arraySize;
    // -------------------------------------------------------------
    public MyHashTable2(int size)
    {
        arraySize = size;
        hashArray = new SortedList[arraySize];
        for(int j=0; j<arraySize; j++)
            hashArray[j] = new SortedList();
    }

    // -------------------------------------------------------------
    public void displayTable()
    {
        for(int j=0; j<arraySize; j++)
        {
            System.out.print(j + ". ");
            hashArray[j].displayList();
        }
    }
    // -------------------------------------------------------------
    public int hashFunc(int key)
    {
        return key % arraySize;
    }
    // -------------------------------------------------------------
    public void insert(Node theNode)
    {
        int key = theNode.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theNode);
    }
    // -------------------------------------------------------------
    public void delete(int key)
    {
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }
    // -------------------------------------------------------------
    public Node find(int key)
    {
        int hashVal = hashFunc(key);
        Node theNode = hashArray[hashVal].find(key);
        return theNode;
    }
// -------------------------------------------------------------
}
////////////////////////////////////////////////////////////////
class HashChainApp {
    public static void main(String[] args) throws IOException {

        int aKey;
        Node aDataItem;
        int size, n, keysPerCell = 100;
// get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
// make table
        MyHashTable2 theHashTable = new MyHashTable2(size);
        for (int j = 0; j < n; j++) // insert data
        {
            aKey = (int) (java.lang.Math.random() *
                    keysPerCell * size);
            aDataItem = new Node(aKey);
            theHashTable.insert(aDataItem);
        }
    }
}
