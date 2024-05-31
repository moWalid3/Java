package BinarySearchTree;

public class BSTNode {  //   binary search tree node
    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode(){

    }




    public BSTNode(int data, BSTNode left, BSTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BSTNode(int data) {
        this.data = data;
    }

    public BSTNode(BSTNode left) {
        this.left = left;
    }



}
