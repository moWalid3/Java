package service;


import java.util.Scanner;

public class StartMenu {

    public void start(){
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        CourseService courseService = new CourseService();
        Scanner s = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("""
                    **************** hello my friend in my project ****************
                    1) Student
                    2) Teacher
                    3) Course
                    4) Exit
                    """);
            System.out.println(">> please enter choice :  ");
            choice = s.nextInt();
            switch (choice) {
                case 1 ->  studentService.studentMenu();

                case 2 ->  teacherService.teacherMenu();

                case 3 ->  courseService.courseMenu();

                case 4 -> System.exit(0);

                default -> System.out.println(">> pro please enter the correct number !!  ");
            }
        }
    }


}
