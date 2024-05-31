package Project.KhalidEkramy;

public class Student {
	
	private String name ;
	private long ID ;
	private float grade ;
	
	public Student(String name , long id , float grade ) {
		this.name = name ;
		this.ID = id ;
		this.grade = grade ;
	}
	
	public long getID() {
		return ID ;
	}

	@Override
	public String toString() {
		return "Student [name : " + name + "\t, ID : " + ID + "\t, grade=" + grade + "]";
	}
	
	
	
}
