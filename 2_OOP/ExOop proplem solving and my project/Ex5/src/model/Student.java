package model;

public class Student extends DataWithPhone {
    private int age;
    public Student(int id,String name,String phone,int age){
        super(id,name,phone);
        this.age=age;
    }
    public Student(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
