package Service;
import java.util.Scanner;
public class MenuService {
    public void mainMenu(){
        FileService fileService=new FileService();
        fileService.start();

        while (true) {
            System.out.println("""
                    _____________ Main Menu _____________
                    1) Student
                    2) Teacher
                    3) Exit
                    -------------------------------------
                    """);
            System.out.print(">> Enter your choice :  ");
            Scanner s = new Scanner(System.in);
            int check = s.nextInt();
            switch (check) {
                case 1 -> studentMenu();
                case 2 -> teacherMenu();
                default ->{
                    fileService.end();
                    System.exit(0);
                }
            }
        }

    }
    public void studentMenu(){
        StudentService studentService =new StudentService();
        int check;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    _____________ Student Menu _____________
                    1) Add
                    2) Display all
                    3) Display by id
                    4) remove
                    5) return to main menu
                    ----------------------------------------
                    """);
            System.out.print(">> Enter your choice :  ");
            check = s.nextInt();
            switch (check) {
                case 1 -> studentService.add();
                case 2 -> studentService.displayAll();
                case 3 -> studentService.displayById();
                case 4 -> studentService.remove();
                case 5 -> {
                    return;
                }
                default -> System.out.println(">> pro write a correct number !!!");
            }
        }

    }
    public void teacherMenu(){
        TeacherService teacherService =new TeacherService();
        Scanner s = new Scanner(System.in);
        int check;
        while (true) {
            System.out.println("""
                    _____________ Teacher Menu _____________
                    1) Add
                    2) Display all
                    3) Display by id
                    4) remove
                    5) return to main menu
                    ----------------------------------------
                    """);
            System.out.print(">> Enter your choice :  ");
            check = s.nextInt();
            switch (check) {
                case 1 -> teacherService.add();
                case 2 -> teacherService.displayAll();
                case 3 -> teacherService.displayById();
                case 4 -> teacherService.remove();
                case 5 -> {
                    return;
                }
                default -> System.out.println(">> pro write a correct number !!!");
            }
        }

    }
}
