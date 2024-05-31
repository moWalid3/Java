import model.Student;
import service.StudentService;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello service!");
        Student s1=new Student(1, 20,"mohamed");
        Student s2=new Student();
        s2.setAge(20);
        s2.setId(2);
        s2.setName("ali");
        StudentService.print(s1);
        StudentService.print(s2);
    }
}