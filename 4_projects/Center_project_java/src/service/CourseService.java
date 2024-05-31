package service;

import module.Course;
import module.Student;


import java.util.ArrayList;
import java.util.Scanner;

public class CourseService implements BaseEntityService {
    ArrayList<Course> courses = new ArrayList<>();

    Scanner s =new Scanner(System.in);
    public  void courseMenu(){
        while (true) {
            System.out.println("""
                    **************** Course Menu ****************
                    1) Add course
                    2) Display course by id
                    3) Display all courses
                    4) Remove course by id
                    5) Assign
                    6) Return back
                    """);
            System.out.println(">> please enter choice :   ");
            int choice = s.nextInt();
            switch (choice) {
                case 1 ->  add();

                case 2 -> System.out.println(displayById());

                case 3 ->  displayAll();

                case 4 -> System.out.println(removeById());

                case 5 -> assign();

                case 6 -> {
                    return;
                }
                default -> System.out.println(">> pro please enter the correct number !! ");
            }
        }
    }
    public boolean isFound(ArrayList<Course> courses, int id) {
        for (Course ele : courses) {
            if (ele.getId()==id)
                return true;
        }
        return false;
    }
    @Override
    public void add (){
        System.out.println(">> please enter id : ");
        int id = s.nextInt();
        if (isFound(courses,id)){
            System.out.println(">> this id is exist pro !! ");
            return;
        }
        System.out.println(">> please enter name :");
        String name = s.next();
        courses.add(new Course(id,name));
    }
    @Override
    public String  displayById (){
        System.out.println(">> please enter id :");
        int id = s.nextInt();
        for (Course ele : courses) {
            if (ele.getId() == id)
                return ele.toString();
        }
        return "the id is not correct pro !! ";
    }
    @Override
    public void  displayAll (){
        System.out.println("---------- Courses ----------");
        int counter = 1;
        for (Course ele : courses) {
            System.out.println(counter+") "+ ele.toString());
            counter++;
        }
        System.out.println("------------------------------");
    }
    @Override
    public String removeById (){
        System.out.println(">> please enter id :");
        int id = s.nextInt();
        for (Course ele : courses) {
            if (ele.getId() == id) {
                courses.remove(ele);
                return " .. success process .. ";
            }
        }
        return "the id is not correct pro !! ";
    }
    public Course getElement(ArrayList<Course> courses,int id){
        for (Course ele : courses) {
            if (ele.getId() == id)
                return ele;
        }
        return null;
    }

    @Override
    public void assign (){
        TeacherService teacherService =new TeacherService();

        while(true) {
            if (courses.size() == 0) {
                System.out.println(">> not found a course !! ");
                return;
            }
            if (teacherService.teachers.size() == 0) {
                System.out.println(">> not found a teacher !! ");
                return;
            }
            displayAll();
            System.out.println(">> enter the course id : ");
            int idCourse = s.nextInt();
            if (!(isFound(courses, idCourse))) {
                System.out.println(">> this id is not found !! ");
                return;
            }
            System.out.println("--------------------------");
            teacherService.displayAll();
            System.out.println("--------------------------");
            System.out.println(">> enter the teacher id : ");
            int idTeacher = s.nextInt();
            if (!(teacherService.isFound(teacherService.teachers, idCourse))) {
                System.out.println(">> this id is not found !! ");
                return;
            }
            getElement(courses, idCourse).setTeacher(teacherService.getElement(teacherService.teachers, idTeacher));
            teacherService.getElement(teacherService.teachers, idTeacher).getCoursesTeacher().add(getElement(courses, idCourse));
            for (Student ele : teacherService.getElement(teacherService.teachers, idTeacher).getStudentsTeacher()) {
                getElement(courses, idCourse).getStudentsCourse().add(ele);
            }
            System.out.println("--- success process ---");
            System.out.println(">> Are you need assign again ( t / f ) ?  ");
            String check=s.next();
            if (!(check.toUpperCase().toCharArray()[0]=='Y'))
                return;
        }
    }



}
