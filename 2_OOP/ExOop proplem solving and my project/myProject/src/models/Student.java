package models;

import enums.Grades;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private Grades grade;
    public Student(String name,String email,Grades grade){
        super(name, email);
        this.grade=grade;
    }
    @Override
    public String getDescription(){
        return  "the grade of student is :  "+grade;

    }
}
