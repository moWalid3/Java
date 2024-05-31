package Project.KhalidEkramy;


/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Khaled
 */
public class Node {
    Student student ;
    Node left ;
    Node right ;
    
    public Node (String name , long id , float grade) {
    	student = new Student(name , id , grade ) ;
    }
    
    public long getID() {
    	return student.getID() ;
    }
    
    public void display() {
    	System.out.println(student.toString());
    }

	@Override
	public String toString() {
		return "[student=" + student + "]";
	}
    
    
}
