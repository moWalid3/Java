package service;

import module.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherService implements BaseEntityService {
    ArrayList<Teacher> teachers = new ArrayList<>();


    Scanner s = new Scanner(System.in);
    public  void teacherMenu(){
        while (true) {
            System.out.println("""
                    **************** Teacher Menu ****************
                    1) Add teacher
                    2) Display teacher by id
                    3) Display all teacher
                    4) Remove teacher by id
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
                default -> System.out.println(">> pro please enter the correct number !!  ");
            }
        }
    }
    public boolean isFound(ArrayList<Teacher> teachers, int id) {
        for (Teacher ele : teachers) {
            if (ele.getId()==id)
                return true;
        }
        return false;
    }
    @Override
    public void add (){
        System.out.println(">> please enter id  :");
        int id = s.nextInt();
        if (isFound(teachers,id)){
            System.out.println(">> this id is exist pro !! ");
            return;
        }
        System.out.println(">> please enter name :");
        String name = s.next();
        teachers.add(new Teacher(id,name));
    }
    @Override
    public String  displayById (){
        System.out.println(">> please enter id :");
        int id = s.nextInt();
        for (Teacher ele : teachers) {
            if (ele.getId() == id)
                return ele.toString();
        }
        return "the id is not correct pro !! ";
    }
    @Override
    public void  displayAll (){
        System.out.println("---------- Teachers ----------");
        int counter = 1;
        for (Teacher ele : teachers) {
            System.out.println(counter+") "+ ele.toString());
            counter++;
        }
        System.out.println("------------------------------");
    }
    @Override
    public String removeById (){
        System.out.println(">> please enter id :");
        int id = s.nextInt();
        for (Teacher ele : teachers) {
            if (ele.getId() == id) {
                teachers.remove(ele);
                return " .. success process .. ";
            }
        }
        return "the id is not correct pro !! ";
    }
    public Teacher getElement(ArrayList<Teacher> teachers, int id){
        for (Teacher ele : teachers) {
            if (ele.getId() == id)
                return ele;
        }
        return null;
    }
    @Override
    public void assign (){
        CourseService courseService = new CourseService();
        while(true) {
            if (courseService.courses.size() == 0) {
                System.out.println(">> not found a course !! ");
                return;
            }
            if (teachers.size() == 0) {
                System.out.println(">> not found a teacher !! ");
                return;
            }
            displayAll();
            System.out.println(">> enter the teacher id : ");
            int idTeacher = s.nextInt();
            if (!(isFound(teachers, idTeacher))) {
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
            getElement(teachers,idTeacher).getCoursesTeacher().add(courseService.getElement(courseService.courses, idCourse));
            courseService.getElement(courseService.courses, idCourse).setTeacher(getElement(teachers,idTeacher));

            System.out.println("--- success process ---");
            System.out.println(">> Are you need assign again ( t / f ) ?  ");
            String check=s.next();
            if (!(check.toUpperCase().toCharArray()[0]=='Y'))
                return;
        }
    }



}
