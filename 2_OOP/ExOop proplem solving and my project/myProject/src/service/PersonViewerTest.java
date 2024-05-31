package service;

import enums.Grades;
import models.Employee;
import models.Lecture;
import models.Student;

public class PersonViewerTest {
    public static void main(String[] args) {
        PersonService person=new PersonViewer();
        Student student = new Student("mohamed", "mohamed@walid.com", Grades.A);
        Lecture lecture = new Lecture("lecture 1", "lecture@.com", "Math");
        Employee employee = new Employee("Employee 1", "Employee@.com", "Sce");

        person.view(student);
        person.view(lecture);
        person.view(employee);
    }
}
