package model;

public class Student {
    private int age;
    private int id;
    private String name;
    public Student(int age,int id,String name){
        this.age=age;
        this.name=name;
        this.id=id;
    }
    public Student (){}
    public void setId(int id){
        this.id=id;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
