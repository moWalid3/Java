package Service;

import model.DayLesson;
import model.Student;
import model.Teacher;
import model.TimeLesson;
import java.util.ArrayList;
import java.util.Scanner;
public class TeacherService implements BaseService {
    static ArrayList<Teacher> teacherList = new ArrayList<>();
    public void someDetails(){
        int counter=1;
        System.out.println("----------- Teachers -----------");
        for (Teacher ele : teacherList) {
            System.out.println(counter+") "+ele.getName()+" ,id: "+ ele.getId()+" ,age: "+ ele.getAge()+" ,subject: "+ele.getSubject()
                    +"\n    day:  "+ele.getDayLesson().name()+"    time:  "+ele.getTime().name().replaceFirst("_","").replaceFirst("_"," : "));
            counter++;
        }
        System.out.println("--------------------------------");
    }
    @Override
    public void add(){
        System.out.println("------------ add Teacher --------------");
        Scanner s = new Scanner(System.in);
        Teacher teacher = new Teacher();
        System.out.print(">> enter your id : ");
        int id=s.nextInt();
        for (Teacher ele : teacherList) {
            if (ele.getId() == id) {
                System.out.println(">> pro this id is Except !!");
                return;
            }
        }
        teacher.setId(id);
        System.out.print(">> enter your name : ");
        teacher.setName(s.next());
        System.out.print(">> enter your age : ");
        teacher.setAge(s.nextInt());
        System.out.print(">> enter your subject : ");
        teacher.setSubject(s.next());
        // enter the day of lesson
        System.out.println("""
                    >> day for your subject :
                       1) sunDay    2) monDay
                       3) tusDay    4) wedDay
                       5) thurDay   6) friDay
                       7) satDay
                    """);
        int  check = 0;
        while (check==0){
            System.out.print(">> enter your choice :");
            check=s.nextInt();
            if (!(check==1||check==2||check==3||check==4||check==5||check==6||check==7)){
                System.out.println(">> pro enter the correct number !!");
                check=0;
                continue;
            }
            switch (check){
                case 1 -> teacher.setDayLesson(DayLesson.SUN_DAY);
                case 2 -> teacher.setDayLesson(DayLesson.MON_DAY);
                case 3 -> teacher.setDayLesson(DayLesson.TUS_DAY);
                case 4 -> teacher.setDayLesson(DayLesson.WED_DAY);
                case 5 -> teacher.setDayLesson(DayLesson.THUR_DAY);
                case 6 -> teacher.setDayLesson(DayLesson.FRI_DAY);
                case 7 -> teacher.setDayLesson(DayLesson.SAT_DAY);
            }
        }
        // enter the time of lesson in this day
        System.out.println("""
                    >> time in your day :
                       1) 09 : 00  Am
                       2) 12 : 00  Pm
                       3) 03 : 00  Pm
                    """);
        check=0;
        while (check==0){
            System.out.print(">> enter your choice : ");
            check=s.nextInt();
            if (!(check==1||check==2||check==3)){
                System.out.println(">> pro enter the correct number !!");
                check=0;
                continue;
            }
            switch (check){
                case 1 -> teacher.setTime(TimeLesson._9_00);
                case 2 -> teacher.setTime(TimeLesson._12_00);
                case 3 -> teacher.setTime(TimeLesson._3_00);
            }
        }
        System.out.println("------------------------------");
        teacherList.add(teacher);
    }
    @Override
    public void displayAll() {
        int counter1=1,counter2;
        System.out.println("***************** Teachers ********************");
        for (Teacher ele : teacherList) {
            System.out.println(counter1+") "+ele.getName()+" ,id: "+ ele.getId()+" ,age: "+ ele.getAge()+" ,subject: "+ele.getSubject()
                    +"\n    day: "+ele.getDayLesson().name()
                    +"    time: "+ele.getTime().name().replaceFirst("_","").replaceFirst("_"," : "));
            counter2=1;
            System.out.println("   ------ Students ------");
            for (Student stu : ele.getStudents()) {
                System.out.println("   "+counter2+") "+stu.getName()+"    id: "+ stu.getId()+"   age: "+ stu.getAge());
                counter2++;
            }
            System.out.println("   -----------------------");

            counter1++;
        }
        System.out.println("***************************************************");
    }
    @Override
    public void displayById() {
        Scanner s=new Scanner(System.in);
        System.out.print(">> enter id : ");
        int id=s.nextInt();
        int counter=1;
        for (Teacher ele : teacherList) {
            if (ele.getId() == id) {
                System.out.println("  >>  "+ele.getName()+" ,id: "+ ele.getId()+" ,age: "+ ele.getAge()+" ,subject: "+ele.getSubject()
                        +"\n     day: "+ele.getDayLesson().name()
                        +"  time: "+ele.getTime().name().replaceFirst("_","").replaceFirst("_"," : "));

                System.out.println("    ------ Students ------");
                for (Student stu : ele.getStudents()) {
                    System.out.println("    "+counter+") "+stu.getName()+"    id: "+ stu.getId()+"   age: "+ stu.getAge());
                    counter++;
                }
                System.out.println("    -----------------------");
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
        for (Teacher ele : teacherList) {
            if (ele.getId() == id) {
                for (Student stu : ele.getStudents()) {
                    StudentService.studentList.removeIf(stu2 -> stu == stu2);
                }
                teacherList.remove(ele);
                return;
            }
        }
        System.out.println(">> this id is n't correct !!!");
    }
}
