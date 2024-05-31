/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.KhalidEkramy;
import java.util.ArrayList; 
/**
 *
 * @author Khaled
 */
public class BinaryTree{
	Node root  ;
	int NumOfSwaps ;
	int NumOfComparisons ;
	public BinaryTree() {
		this.root = null ;
		this.NumOfSwaps = 0 ;
		this.NumOfComparisons = 0 ;
	}
	
	public void insert(String name , long id , float grade ) {
		Node parentNode ;
		Node current = root ;
		Node temp = new Node(name , id , grade) ;
		if(root == null) {
			root = temp ;
		}else {
			while(current != null) {
				parentNode = current ;
				NumOfComparisons++ ;
				
				if(id < current.getID()) {
					current = current.left ;
					if(current == null) {
						parentNode.left = temp ;
						NumOfSwaps++ ;
					}
				}else {
					current = current.right ;
					if(current == null ) {
						NumOfSwaps++ ;
						parentNode.right = temp ;
					}
				}
			}
			
			
		}
	}
	
	public boolean isEmpty() {
		return root == null ;
	}
	
	
	public Node find(long key) {
		
		Node current = root ;
		while(current != null) {
			NumOfComparisons++ ;
			if(key == current.getID()) {
				return current ;
			}else if(key < current.getID()) {
				current = current.left ;
			}else {
				current =current.right ;
			}
			
		}
		return null ;
	}

	public Node delete(long key) {

		Node parent = root ;
		Node current = root ;
		boolean isLeftChild = true ;
		while(current.getID() != key) {

			parent = current ;
			if(key < current.getID()) {
				isLeftChild = true ;
				current = current.left ;
				NumOfComparisons++ ;
			}else {
				isLeftChild = false ;
				current = current.right ;
				NumOfComparisons++ ;
			}

			if(current == null)
				return null ;
		}


		if(current.left == null && current.right == null ) {

			if(current == root ) {
				root = null ;
				NumOfSwaps++ ;
				return current ;
			}
			if(isLeftChild) {
				parent.left = null ;
				NumOfSwaps++ ;
				return current ;
			}else {
				parent.right = null ;
				NumOfSwaps++ ;
				return current ;
			}
		}else if(current.left != null && current.right == null) {
			if(current == root) {
				root = current.left ;
				NumOfSwaps++ ;
				return current ;
			}
			if(isLeftChild) {
				parent.left = current.left ;
				NumOfSwaps++ ;
				return current ;
			}else {
				parent.right = current.left ;
				NumOfSwaps++ ;
				return current ;
			}
		}else if(current.left == null) {
			if(current == root) {
				root = current.right ;
				NumOfSwaps++ ;
				return current ;
			}else if(isLeftChild) {
				parent.left = current.right ;
				NumOfSwaps++ ;
				return current ;
			}else {
				parent.right = current.right ;
				NumOfSwaps++ ;
				return current ;
			}
		}else {
			Node successor = getSuccessor(current) ;

			if(current == root ) {
				root = successor ;
				NumOfSwaps++ ;
				successor.left = current.left ;
				return current ;
			}else if(isLeftChild) {
				parent.left = successor ;
				NumOfSwaps++ ;
				successor.left = current.left ;
				return current ;
			}else {
				parent.right = successor ;
				NumOfSwaps++ ;
				successor.left = current.left ;
				return current ;
			}
		}
	}

	public Node getSuccessor(Node delNode) {

		Node successorParent = delNode ;
		Node successor = delNode ;
		Node current = delNode.right ;

		while(current != null) {
			successorParent = successor ;
			successor = current ;
			current = current.left ;
		}

		NumOfComparisons++ ;
		if(successor != delNode.right) {
			successorParent.left = successor.right ;
			successor.right = delNode.right ;
			NumOfSwaps++ ;
		}

		return successor ;
	}
	
	public Node findMinValue() {
		
    	Node current = root ;
    	
    	while(true) {
    		if(current.left == null)
    			return current ;
    		else
    			current = current.left ;
    	}
    	
    }
    
	
    public Node findMaxValue() {
    	
    	Node current = root ;
    	
    	while(true) {
    		if(current.right == null)
    			return current ;
    		else
    			current = current.right ;
    	}
    }
    
    
    public int height() {
		if(isEmpty())
			return -1 ;
		else {
			return calcHeight(root) ;
		}
	}
	
	private int calcHeight(Node localRoot) {
		
		int leftHeight = -1, rightHeight = -1;  

        if(localRoot.left != null)  
            leftHeight = calcHeight(localRoot.left);  

        if(localRoot.right != null)  
            rightHeight = calcHeight(localRoot.right);

		NumOfComparisons++ ;
		if(leftHeight > rightHeight) {
			return leftHeight + 1 ;
        }else {
			return rightHeight + 1 ;
        }
	}
	
	
	public int size() {
		return calcSize(root) ;
	}
	
	private int calcSize(Node currRoot) {
		
			if(currRoot == null)
				return 0 ;
			
			if(currRoot.right == null && currRoot.left == null)
				return 1 ;
			
			return 1 + calcSize(currRoot.right) + calcSize(currRoot.left) ;
	}
	
	
	public boolean containsNonBST(int item) {
		return isExist(root , item) ;
	}
	
	private  boolean isExist(Node localRoot , int item) {
		
		if(localRoot == null) 
			return false ;
		
		NumOfComparisons++ ;
		if(item == localRoot.getID()) 
			return true ;
		else if(item < localRoot.getID()) 
			return isExist(localRoot.left , item) ;
		else
			return isExist(localRoot.right , item) ;
	}
	
	
	public String toString() {
		return binaryString(root) ;
	}
	private  String binaryString(Node currNode) {
		if(currNode == null )
			return "";
		else
			return (binaryString(currNode.left) + currNode.toString() + "\t" + binaryString(currNode.right) ) ;
	}
	
	public ArrayList<Object> toArrayList(){
		
		ArrayList<Object> list = new ArrayList<>() ;
		toArrayList(root , list) ;
		return list ;
		
	}
	
	private void toArrayList(Node currNode , ArrayList<Object> list) {
		
		if(currNode != null) {
			toArrayList(currNode.left , list ) ;
			list.add(currNode.student) ;
			toArrayList(currNode.right , list) ;
		}
		
	}
	
	
	public void displayBinaryTree() {
		System.out.println("Display Inorder : ");
		displayInOrder(root) ;
		System.out.println("Display preorder : ");
		displayPreOrder(root) ;
		System.out.println("Display postorder : ");
		displayPostOrder(root) ;
		
	}
	
	public void displayInOrder(Node localRoot) {

		if(localRoot != null) {
			displayInOrder(localRoot.left) ;
			localRoot.display();
			displayInOrder(localRoot.right) ;
		}
		
	}
	
	public void displayPreOrder(Node localRoot) {
		if(localRoot != null) {
			localRoot.display(); 
			displayPreOrder(localRoot.left) ;
			displayPreOrder(localRoot.right) ;
		}
	}
	
	public void displayPostOrder(Node localRoot) {
		if(localRoot != null) {
			displayPostOrder(localRoot.left) ;
			displayPostOrder(localRoot.right) ;
			localRoot.display();
		}
	}
	
	
	
}
