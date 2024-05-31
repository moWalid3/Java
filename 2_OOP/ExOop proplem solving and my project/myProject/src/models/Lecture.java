package models;

public class Lecture extends Person {
    private String subject;
    public Lecture(String name,String email,String subject){
        super(name, email);
        this.subject=subject;
    }
    @Override
    public String getDescription(){
        return  "Teaches :  "+subject;
    }
}
