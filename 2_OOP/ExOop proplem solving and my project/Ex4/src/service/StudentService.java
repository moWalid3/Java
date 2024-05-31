package service;

import model.Student;
import validate.ValidationService;

public class StudentService implements CanStudent {
    @Override
    public void print(Student student){
        if (ValidationService.checkAge(student))
            System.out.println(student.getAge()+"  "+student.getId()+"  "+student.getName());
        else
            System.out.println("invalid number");
    }

}
