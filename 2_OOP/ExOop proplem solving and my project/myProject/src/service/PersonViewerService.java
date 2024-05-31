package service;

import enums.Grades;
import models.Employee;
import models.Lecture;
import models.Person;
import models.Student;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonViewerService extends PersonViewer{

    public Scanner scanner = new Scanner(System.in);
    private int choice;
    static ArrayList <Student> students = new ArrayList<>();
    static ArrayList <Lecture> lectures = new ArrayList<>();
    static ArrayList <Employee> employees = new ArrayList<>();

    public static void finalFile() throws IOException {

        File fileStudents = new File("students.txt");
        File fileLectures = new File("lectures.txt");
        File fileEmployees = new File("employees.txt");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileEmployees));
        ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream(fileLectures));
        ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream(fileStudents));

        oos2.writeObject(students);
        oos.writeObject(employees);
        oos1.writeObject(lectures);

        oos.flush();
        oos.close();
        oos1.flush();
        oos1.close();
        oos2.flush();
        oos2.close();

    }

    public static void startFile() throws IOException, ClassNotFoundException {
        File fileStudents = new File("students.txt");
        File fileLectures = new File("lectures.txt");
        File fileEmployees = new File("employees.txt");
        if(fileEmployees.createNewFile()&& fileLectures.createNewFile()&& fileStudents.createNewFile()){
           System.out.println();
        }
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileEmployees));
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream(fileLectures));
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream(fileStudents));

        students = (ArrayList<Student>) ois2.readObject();
        lectures = (ArrayList<Lecture>) ois1.readObject();
        employees = (ArrayList<Employee>) ois.readObject();

        ois.close();
        ois1.close();
        ois2.close();

    }

    @Override
    public void view(Person person) {
       // if (person instanceof )
        System.out.println("your objects is instanceof :".getClass().getSimpleName());
    }

    public void mainMenu() throws IOException {
        while(true) {
            System.out.println("""
                    ----- Main Menu -----
                    1) Student
                    2) Lecture
                    3) Employee
                    4) Exit
                    ----------------------
                    """);
            System.out.println("Enter Choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> studentMenu();
                case 2 -> lectureMenu();
                case 3 -> employeeMenu();
                case 4 -> {
                    finalFile();
                    System.exit(0);
                }
            }
        }

    }
    public void studentMenu(){
        while(true) {
            System.out.println("""
                    ----- Student Menu -----
                    1) Add Student
                    2) Calculate Average
                    3) Display Students
                    4) Remove Students
                    5) Return the Menu
                    ----------------------
                    """);
            System.out.println("Enter Choice :");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addStudent() ;
                case 2 -> calculateAverage();
                case 3 -> displayStudent();
                case 4 -> removeStudent();
                case 5 -> {
                    return;
                }
            }
        }

    }
    public void lectureMenu(){
        while(true) {
            System.out.println("""
                    ----- Lecture Menu -----
                    1) Add Lecture
                    2) Display Lecture
                    3) Remove lecture
                    4) Return the Menu
                    ----------------------
                    """);
            System.out.println("Enter Choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addLecture();
                case 2 -> displayLecture();
                case 3 -> removeLecture();
                case 4 -> {
                    return;
                }
            }
        }

    }
    public void employeeMenu(){
        while(true) {
            System.out.println("""
                    ----- Employee Menu -----
                    1) Add Employee
                    2) Calculate yearly salary
                    3) Display Employee
                    4) Remove Employee
                    5) Return the Menu
                    ----------------------
                    """);
            System.out.println("Enter Choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> CalculateYearlySalary();
                case 3 -> displayEmployee();
                case 4 -> removeEmployee();
                case 5 -> {
                    return;
                }
            }
        }

    }
    private String name;
    private String email;
    private void addStudent(){
        System.out.println("***** Add Student *****");
        System.out.println("Enter your name :");
        name= scanner.next();
        System.out.println("Enter your email :");
        email= scanner.next();
        System.out.println("Enter your grade ex( A , B , C ):");
        Grades grade ;
        char gradeChar = scanner.next().toUpperCase().charAt(0);
        if (gradeChar == 'A')
            grade=Grades.A;
        else if(gradeChar == 'B')
            grade=Grades.B;
        else
            grade=Grades.C;
        students.add(new Student(name,email,grade));
    }
    private void removeStudent(){
        System.out.println("Enter name :");
        name = scanner.next();
        students.removeIf(ele -> ele.getName().equalsIgnoreCase(name));
        System.out.println("the remove is done ...\n");
    }
    private void removeEmployee(){
        System.out.println("Enter name :");
        name = scanner.next();
        employees.removeIf(ele -> ele.getName().equalsIgnoreCase(name));
        System.out.println("the remove is done ...\n");
    }
    private void removeLecture(){
        System.out.println("Enter name lecture's :");
        name = scanner.next();
        lectures.removeIf(ele -> ele.getName().equalsIgnoreCase(name));
        System.out.println("the remove is done ...\n");
    }

    private void addLecture(){
        System.out.println("***** Add Lecture *****");
        System.out.println("Enter your name : ");
        name = scanner.next();
        System.out.println("Enter your email :");
        email= scanner.next();
        System.out.println("Enter your subject :");
        String subject = scanner.next();
        lectures.add(new Lecture(name,email, subject));
    }
    private void addEmployee(){
        System.out.println("***** Add Employee *****");
        System.out.println("Enter your name : ");
        name= scanner.next();
        System.out.println("Enter your email :");
        email= scanner.next();
        System.out.println("Enter your department :");
        String department = scanner.next();
        employees.add(new Employee(name,email, department));
    }
    private void displayStudent(){
        System.out.println("***** Display Student *****\n");
        int size =students.size();
        for (int i = 0; i < size; i++) {
            System.out.print((i+1)+") ");
            super.view(students.get(i));
        }
    }
    private void displayLecture(){
        System.out.println("***** Display Lecture *****\n");
        int size =lectures.size();
        for (int i = 0; i < size; i++) {
            System.out.print((i+1)+") ");
            super.view(lectures.get(i));
        }
    }
    private void displayEmployee(){
        System.out.println("***** Display Employee *****\n");
        int size =employees.size();
        for (int i = 0; i < size; i++) {
            System.out.print((i+1)+") ");
            super.view(employees.get(i));
        }
    }
    private void calculateAverage(){
        System.out.println("***** Calculate Average *****");
        System.out.println("Enter numbers mark :");
        int all=scanner.nextInt();
        double mark;
        double sum=0;
        for (int i = 1; i <=all ; i++) {
            System.out.println("Enter mark "+i+" :");
            mark=scanner.nextDouble();
            sum+=mark;
        }
        System.out.println("Average is : "+(sum/all));
    }
    private void CalculateYearlySalary(){
        System.out.println("***** Calculate Yearly Salary *****");
        System.out.println("Enter salary of month : ");
        double salary=scanner.nextDouble();
        System.out.println("your salary of year is : "+Math.floor(salary*12));
    }



}
