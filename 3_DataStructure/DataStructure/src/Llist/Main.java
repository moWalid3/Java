package Llist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        myLinkedList mylink=new myLinkedList();
        System.out.println("enter the number of nodes you need :");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int n;
        for (int i = 0; i < size; i++) {
            System.out.println("enter the node "+(i+1)+" :");
            n= s.nextInt();
            if (mylink.search(n)!=-1){
                System.out.println("!! pro this node is exist ...");
                continue;
            }
            mylink.insertAtEnd(n);
        }
//        System.out.println(">>  swap : ");
//        mylink.swapFirstLast();
//        mylink.printAll();
//        System.out.println("your LList is have a " +mylink.count()+" nodes .");
//        mylink.printEvenNodes();
//        mylink.addNodeAfter(22);
//        mylink.printAll();
//        System.out.println("******************************");
//        mylink.deleteNodeAfter(33);
        mylink.printAll();
 //       System.out.println(mylink.findLargest());
        mylink.deleteEndNode();
        mylink.printAll();











    }
}