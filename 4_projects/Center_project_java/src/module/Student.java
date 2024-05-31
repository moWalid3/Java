package module;

public class Student extends BaseEntity{

    public Student(int id, String name) {
        super(id, name);
    }
    private Course  course;
    private Teacher teacher;

    public Student() {
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    @Override
    public String toString() {
        return  "id = " + getId() +"    name = " + getName()+"   teacher = "+getTeacher().show()+"\n   Course = " +getCourse().show() ;
    }

}
