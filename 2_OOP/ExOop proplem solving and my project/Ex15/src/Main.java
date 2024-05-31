import model.Course;
import model.Student;



public class Main {
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();
        Student st3=new Student();
        Student st4=new Student();

        st1.setName("mohamed");
        st2.setName("ali");
        st3.setName("mousa");
        st4.setName("ahmed");

        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        Course course4 = new Course();

        course1.setCourseName("java");
        course2.setCourseName("payton");
        course3.setCourseName("js");
        course4.setCourseName("C++");

        // student 1 go course 1,2,4
        course1.getStudents().add(st1);
        course2.getStudents().add(st1);
        course4.getStudents().add(st1);

        st1.getCourses().add(course1);
        st1.getCourses().add(course2);
        st1.getCourses().add(course4);

        // student 2 go course 4,3
        course4.getStudents().add(st2);
        course3.getStudents().add(st2);

        st2.getCourses().add(course4);
        st2.getCourses().add(course3);

        // student 3 go course 2
        course1.getStudents().add(st3);

        st3.getCourses().add(course1);

        System.out.println("Student 1 : -> "+st1.getCourses().size());
        System.out.print(st1.getCourses().get(0).getCourseName()+"  ");
        System.out.print(st1.getCourses().get(1).getCourseName()+"  ");
        System.out.print(st1.getCourses().get(2).getCourseName()+"  \n");

        System.out.println("Student 2 : -> "+st2.getCourses().size());
        System.out.print(st2.getCourses().get(0).getCourseName()+"  ");
        System.out.print(st2.getCourses().get(1).getCourseName()+"  \n");

        System.out.println("Student 3 : -> "+st3.getCourses().size());
        System.out.print(st3.getCourses().get(0).getCourseName()+"  \n");

        System.out.println("Course 1 : -> "+course1.getStudents().size());
        System.out.print(course1.getStudents().get(0).getName()+"  ");
        System.out.print(course1.getStudents().get(1).getName()+"  \n");

        System.out.println("Course 2 : -> "+course2.getStudents().size());
        System.out.println(course2.getStudents().get(0).getName()+"  \n");

        System.out.println("Course 3 : -> "+course3.getStudents().size());
        System.out.println(course3.getStudents().get(0).getName()+"  \n");

        System.out.println("Course 4 : -> "+course4.getStudents().size());
        System.out.print(course4.getStudents().get(0).getName()+"  ");
        System.out.println(course4.getStudents().get(1).getName()+"  ");






    }
}