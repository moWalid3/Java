package module;

import java.util.ArrayList;

public class Teacher extends BaseEntity {

    public Teacher(int id, String name) {
        super(id, name);
    }
    public Teacher(){

    }

    private ArrayList<Student> studentsTeacher=new ArrayList<>();
    private ArrayList<Course> coursesTeacher=new ArrayList<>();

    public ArrayList<Course> getCoursesTeacher() {
        return coursesTeacher;
    }

    public void setCoursesTeacher(ArrayList<Course> coursesTeacher) {
        this.coursesTeacher = coursesTeacher;
    }

    public ArrayList<Student> getStudentsTeacher() {
        return studentsTeacher;
    }

    public void setStudentsTeacher(ArrayList<Student> studentsTeacher) {
        this.studentsTeacher = studentsTeacher;
    }
    @Override
    public String toString() {
        return  "id = " + getId() +"    name = " + getName()+"\n   >> student : "+showStu()+"\n   >> Courses : \n" +showCour() ;
    }
    public String showStu(){
        String value="";
        int counter=1;
        for (Student ele : studentsTeacher) {
            value = value.concat( counter+") "+"id = "+ele.getId()+"  name = "+ele.getName()+"\n         ");
            counter++;
        }
        return value;
    }
    public String showCour(){
        String value="";
        int counter=1;
        for (Course ele : coursesTeacher) {
            value = value.concat( counter+") "+"id = "+ele.getId()+"  name = "+ele.getName()+"\n         ");
            counter++;
        }
        return value;
    }
}
