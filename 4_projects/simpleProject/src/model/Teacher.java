package model;

import java.util.ArrayList;
public class Teacher extends Person{
    private String subject;
    private DayLesson dayLesson;
    private TimeLesson time;
    private ArrayList<Student> students=new ArrayList<>();
    public TimeLesson getTime() {
        return time;
    }
    public void setTime(TimeLesson time) {
        this.time = time;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public DayLesson getDayLesson() {
        return dayLesson;
    }
    public void setDayLesson(DayLesson dayLesson) {
        this.dayLesson = dayLesson;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
