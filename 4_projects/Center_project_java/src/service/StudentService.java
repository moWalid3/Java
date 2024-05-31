package service;

import module.Student;
import module.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements BaseEntityService {

    ArrayList<Student> students = new ArrayList<>();

        Scanner s =new Scanner(System.in);
    public  void studentMenu(){
        while (true) {
            System.out.println("""
                    **************** Student Menu ****************
                    1) Add student
                    2) Display student by id
                    3) Display all students
                    4) Remove student by id
                    5) Assign
                    6) Return back
                    """);
            System.out.println(">> please enter choice :   ");
            int choice = s.nextInt();
            switch (choice) {
                case 1 -> add();

                case 2 -> System.out.println(displayById());

                case 3 -> displayAll();

                case 4 -> System.out.println(removeById());

                case 5 -> assign();

                case 6 -> {
                    return;
                }

                default -> System.out.println(">> pro please enter the correct number !! ");
            }
        }
    }
    public boolean isFound(ArrayList<Student> students, int id) {
        for (Student ele : students) {
            if (ele.getId()==id)
                return true;
        }
        return false;
    }
    @Override
    public void add (){
        System.out.println(">> please enter id :");
        int id = s.nextInt();
        if (isFound(students,id)){
            System.out.println(">> this id is exist pro !! ");
            return;
        }
        System.out.println(">> please enter name :");
        String name = s.next();
        students.add(new Student(id,name));
    }
    @Override
    public String  displayById (){
        System.out.println(">> please enter id :");
        int id = s.nextInt();
        for (Student ele : students) {
            if (ele.getId() == id)
                return ele.toString();
        }
         return "the id is not correct pro !! ";
    }
    @Override
    public void  displayAll (){
        System.out.println("---------- Students ----------");
        int counter = 1;
        for (Student ele : students) {
            System.out.println(counter+") "+ ele.toString());
            counter++;
        }
        System.out.println("------------------------------");
    }
    @Override
    public String removeById (){
        System.out.println(">> please enter id :");
        int id = s.nextInt();
        for (Student ele : students) {
            if (ele.getId() == id) {
                students.remove(ele);
                return " .. success process .. ";
            }
        }
        return "the id is not correct pro !! ";
    }
    public Student getElement(ArrayList<Student> students,int id){
        for (Student ele : students) {
            if (ele.getId() == id)
                return ele;
        }
        return null;
    }
    @Override
    public void assign (){
        CourseService courseService = new CourseService();
        TeacherService teacherService =new TeacherService();
        while (true) {
            if (students.size() == 0) {
                System.out.println(">> not found a student !! ");
                return;
            }
            if (courseService.courses.size() == 0) {
                System.out.println(">> not found a course !! ");
                return;
            }
            displayAll();
            System.out.println(">> enter the student id : ");
            int idStudent = s.nextInt();
            if (!(isFound(students, idStudent))) {
                System.out.println(">> this id is not found !! ");
                return;
            }
            System.out.println("--------------------------");
            courseService.displayAll();
            System.out.println("--------------------------");
            System.out.println(">> enter the course id : ");
            int idCourse = s.nextInt();
            if (!(courseService.isFound(courseService.courses, idCourse))) {
                System.out.println(">> this id is not found !! ");
                return;
            }
            getElement(students, idStudent).setCourse(courseService.getElement(courseService.courses, idCourse));
            courseService.getElement(courseService.courses, idCourse).getStudentsCourse().add(getElement(students, idStudent));
            getElement(students, idStudent).setTeacher(courseService.getElement(courseService.courses, idCourse).getTeacher());
            for (Teacher ele : teacherService.teachers) {
                if (ele.getId() == courseService.getElement(courseService.courses, idCourse).getTeacher().getId()) {
                    ele.getStudentsTeacher().add(getElement(students, idStudent));
                    return;
                }
            }
            System.out.println("   --- success process ---");
            System.out.println(">> Are you need assign again ( t / f ) ?  ");
            String check=s.next();
            if (!(check.toUpperCase().toCharArray()[0]=='Y'))
                return;
        }
    }

}
