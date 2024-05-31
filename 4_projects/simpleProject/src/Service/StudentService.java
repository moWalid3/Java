package Service;

import model.Student;
import model.Teacher;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentService implements BaseService {
    static ArrayList<Student> studentList = new ArrayList<>();
    @Override
    public void add(){
        TeacherService teacherService = new TeacherService();
        System.out.println("------------ add student --------------");
        Scanner s=new Scanner(System.in);
        Student student = new Student();
        System.out.print(">> enter your id : ");
        int id =s.nextInt();
        for (Student ele : studentList) {
            if (ele.getId() == id) {
                System.out.println(">> pro this id is Except !!");
                return;
            }
        }
        student.setId(id);
        System.out.print(">> enter your name : ");
        student.setName(s.next());
        System.out.print(">> enter your age : ");
        student.setAge(s.nextInt());
        if (TeacherService.teacherList.isEmpty()){
            System.out.println(">> pro you must sign a teacher in this program\n  because not find any teacher now.");
            teacherService.add();
            TeacherService.teacherList.get(0).getStudents().add(student);
            student.setTeacher(TeacherService.teacherList.get(0));
            studentList.add(student);
        }else {
            System.out.println(">> choice your teacher pro : ");
            teacherService.someDetails();
            boolean checkId = false;
            while (true){
                System.out.print(">> enter id your teacher :");
                id=s.nextInt();
                for (Teacher ele : TeacherService.teacherList) {
                    if (id == ele.getId()) {
                        checkId=true;
                        student.setTeacher(ele);
                        ele.getStudents().add(student);
                        studentList.add(student);
                        break;
                    }
                }
                if (checkId)
                    return;
                else
                    System.out.println(">> enter the correct id pro !!");
            }
        }

    }
    @Override
    public void displayAll() {
        int counter=1;
        System.out.println("------------ Students ------------");
        for (Student ele : studentList) {
            System.out.println(counter+") "+ele.getName()+"    id: "+ ele.getId()+"   age: "+ ele.getAge());
            System.out.println("   >> Teacher: "+ele.getTeacher().getName()+" ,id: "+ ele.getTeacher().getId()+" ,age: "+ ele.getTeacher().getAge()+" ,subject: "+ele.getTeacher().getSubject()
                    +"\n               day: "+ele.getTeacher().getDayLesson().name()+"    time: "+ele.getTeacher().getTime().name().replaceFirst("_","").replaceFirst("_"," : "));
            counter++;
        }
        System.out.println("----------------------------------");
    }
    @Override
    public void displayById() {
        Scanner s=new Scanner(System.in);
        System.out.print(">> enter id : ");
        int id=s.nextInt();
        for (Student ele : studentList) {
            if (ele.getId() == id) {
                System.out.println(">> "+ele.getName()+"    id: "+ ele.getId()+"   age: "+ ele.getAge());
                System.out.println("   >> Teacher: "+ele.getTeacher().getName()+" ,id: "+ ele.getTeacher().getId()+" ,age: "+ ele.getTeacher().getAge()+" ,subject: "+ele.getTeacher().getSubject()
                        +"\n               day: "+ele.getTeacher().getDayLesson().name()+"    time: "+ele.getTeacher().getTime().name().replaceFirst("_","").replaceFirst("_"," : "));
                return;
            }
        }
        System.out.println(">> this id is n't correct !!!");
    }
    @Override
    public void remove() {
        Scanner s=new Scanner(System.in);
        System.out.print(">> enter id : ");
        int id=s.nextInt();
        for (Student ele : studentList) {
            if (ele.getId() == id) {
                studentList.remove(ele);
                return;
            }
        }
        System.out.println(">> this id is n't correct !!!");
    }
}
