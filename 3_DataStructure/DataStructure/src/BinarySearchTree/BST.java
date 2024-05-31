package BinarySearchTree;

import queueLList.QueueLList;

public class BST {
    BSTNode root;

    // method
    public void preOrder(BSTNode root) { // visit root then, left then, right
        if (root != null){
            System.out.print(root.data+" , ");
            preOrder(root.left);
            preOrder(root.right);
        }
        System.out.println();
    }
    public void inOrder(BSTNode root){ // visit left then, root then, right
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data+" , ");
            inOrder(root.right);
        }
        System.out.println();
    }
    public void postOrder(BSTNode root){ // visit left then, right then, root
        if (root != null){
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data+" , ");
        }
        System.out.println();
    }
    /*
        QueueLList myQueue=new QueueLList();
    public void breadthFirstTraversal(BSTNode root){ // at only level by sorted from left to right
        myQueue.enQueue(root.data);


    }
 */

    // binary search --> sorted   --> left < right
    public  BSTNode search(int data){
        BSTNode helpPointer = root;
        while (helpPointer.data != data){
            if (data > helpPointer.data)
                helpPointer = helpPointer.right;
            else
                helpPointer=helpPointer.left;
            if (helpPointer==null)
                return null;
        }
        return helpPointer;
    }




}
