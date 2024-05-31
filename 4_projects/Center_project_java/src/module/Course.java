package module;

import java.util.ArrayList;

public class Course  extends BaseEntity {
    public Course (int id, String name) {
        super(id, name);
    }
    public Course (){

    }


    private ArrayList<Student> studentsCourse = new ArrayList<>();
    private Teacher teacher;

    @Override
    public String toString() {
        return  "id = " + getId() +"    name = " + getName()+"   teacher = "+getTeacher().show()+"\n   >> Student : \n" +showStu() ;
    }
    public String showStu(){
        String value="";
        int counter=1;
        for (Student ele : studentsCourse) {
            value = value.concat( counter+") "+"id = "+ele.getId()+"  name = "+ele.getName()+"\n         ");
            counter++;
        }
        return value;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudentsCourse() {
        return studentsCourse;
    }

    public void setStudentsCourse(ArrayList<Student> studentsCourse) {
        this.studentsCourse = studentsCourse;
    }
}
