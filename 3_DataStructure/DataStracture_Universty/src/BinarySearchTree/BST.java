package BinarySearchTree;
public class BST {
    public class Node{
        int data;
        Node leftChile;
        Node rightChile;
        public Node(int data){
            this.data = data;
            leftChile = null;
            rightChile = null;
        }
    }
    Node root;
    public BST(){
        this.root = null;
    }

    public Node find(int key){
        Node current = root;
        while (current.data != key){
            if (current.data > key)
                current = current.leftChile;
            else
                current = current.rightChile;
            if (current == null)
                return null;
        }
        return current;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = current;
        boolean isLeft = false;

        while (current != null) {
            parent = current;
            if (current.data > data) {
                isLeft = true;
                current = current.leftChile;
            } else {
                current = current.rightChile;
                isLeft = false;
            }
        }
        if (isLeft)
            parent.leftChile = newNode;
        else
            parent.rightChile = newNode;
    }
    public Node deleteLeaf(int key){
        Node current = root;
        Node parent  = current;
        boolean isLeft = false;
        while (current.data != key){
            parent  = current;
            if (current.data > key){
                isLeft = true;
                current = current.leftChile;
            } else  {
                isLeft = false;
                current = current.rightChile;
            }
            if (current == null)
                return null;
        }
        if (isLeft)
            parent.leftChile = null;
        else
            parent.rightChile = null;

        return current;
    }
    public void traverse(int traverseType)
    {
        switch (traverseType) {
            case 1 -> {
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
            }
            case 2 -> {
                System.out.print("\nInorder traversal: ");
                inOrder(root);
            }
            case 3 -> {
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
            }
        }
        System.out.println();
    }

    // -------------------------------------------------------------
    private void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.data + "  ");
            preOrder(root.leftChile);
            preOrder(root.rightChile);
        }
    }
    // -------------------------------------------------------------
    private void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.leftChile);
            System.out.print(root.data + "  ");
            inOrder(root.rightChile);
        }
    }
    // -------------------------------------------------------------
    private void postOrder(Node root)
    {
        if(root != null)
        {
            postOrder(root.leftChile);
            postOrder(root.rightChile);
            System.out.print(root.data + "  ");
        }
    }
    public int max(){
        Node current = root;
        while (current.rightChile != null)
            current = current.rightChile;

        return current.data;
    }

public static class Main{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(8);
        bst.insert(15);
        bst.insert(20);
        bst.insert(4);
        bst.insert(9);
        bst.insert(6);
        bst.insert(7);

       // System.out.println(bst.deleteLeaf(20).data);
        System.out.println(bst.find(15).data);
        System.out.println(bst.max());

    }

}
}




