package service;

import model.Student;

public class StudentService {
    public static void print (Student ob){
        System.out.println(ob.getId()+" , "+ob.getAge()+" , "+ob.getName());
    }
}
