import model.Email;
import model.Student;

public class Main {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.setName("mohamed");

        Email m1=new Email();
        Email m2=new Email();
        Email m3=new Email();
        Email m4=new Email();

        m1.setEmail("mohamed@290.com");
        m2.setEmail("mahmoud@290.com");
        m3.setEmail("omar@290.com");
        m4.setEmail("ali@290.com");

        s1.getEmails().add(m1);
        s1.getEmails().add(m2);
        s1.getEmails().add(m3);
        s1.getEmails().add(m4);

        m1.setStudent(s1);
        m2.setStudent(s1);
        m3.setStudent(s1);
        m4.setStudent(s1);

        System.out.println(m1.getStudent().getName());
        System.out.println(m2.getStudent().getName());
        System.out.println(m3.getStudent().getName());
        System.out.println(m4.getStudent().getName());

        System.out.println(s1.getEmails().get(0).getEmail());
        System.out.println(s1.getEmails().get(1).getEmail());
        System.out.println(s1.getEmails().get(2).getEmail());
        System.out.println(s1.getEmails().get(3).getEmail());
    }
}