/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Project.KhalidEkramy;

import java.util.ArrayList;
/**
 *
 * @author Khaled
 */
public class BinarySearchTree {

    public static void main(String[] args) {
        
    	BinaryTree tree = new BinaryTree() ;
    /*
    	tree.insert("Mahmoud", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Ahmed", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Ali", 23819275, (float) (Math.random() * 100));
        tree.insert("Sara", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Layla", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Omar", 83927501, (float) (Math.random() * 100));
        tree.insert("Yousef", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Hassan", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Fatima", 67403819, (float) (Math.random() * 100));
        tree.insert("Aisha", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Mohamed", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Nour", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Khaled", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Rana", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Salem", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Mona", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Ebrahim", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Anas", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("Abdelfattah", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
        tree.insert("AbdelRahman", (long) (Math.random() * 100000000), (float) (Math.random() * 100));
      */
		tree.insert("ali",10,11.2F);
		tree.insert("ali",15,11.2F);
		tree.insert("ali",8,11.2F);
		tree.insert("ali",4,11.2F);
		tree.insert("ali",9,11.2F);
		tree.insert("ali",20,11.2F);
		tree.insert("ali",6,11.2F);
		tree.insert("ali",7,11.2F);

	//	System.out.println(tree.height());
		tree.displayPreOrder(tree.root);
		System.out.println(tree.delete(7));
		System.out.println("--------------------------------------");
		tree.displayPreOrder(tree.root);
		System.exit(0);









    	System.out.println();
    	System.out.println("Before deletion : ");
    //	tree.displayBinaryTree();
    	System.out.println();
    	
    	System.out.print("finding Student with ID 23819275  : ");
    	tree.find(23819275).display();
    	
    	System.out.println("The minimum Value = " ) ; 
    	tree.findMinValue().display()  ;
    	System.out.println("The maximum Value = " ) ;
    	tree.findMaxValue().display();
    	
    	System.out.println("After deleting key of 12 : ");
    	tree.delete(12) ;
   // 	tree.displayBinaryTree();
    	
    	System.out.println("After deleting max and min value : ");
    	tree.delete(20) ;
    	tree.delete(7) ;
    //	tree.displayBinaryTree();
    	
    	System.out.println("The height of the tree equals : " + tree.height());
    	
    	System.out.println("The number of elements in the binary tree = " + tree.size());
    	
    	System.out.print("Finding student with ID = 23819275 : " );
    	System.out.println(tree.containsNonBST(23819275));
    	
    	System.out.println("To String method : ");
    //	System.out.println(tree.toString());
    	
    	
    	System.out.println("Elements of the binary tree in Array list : ");
    	ArrayList<Object> list ;
    	list = tree.toArrayList() ;
    	for (Object object : list) {
			System.out.println(object);
		}
    	
    	
    	
    	

    }
}
