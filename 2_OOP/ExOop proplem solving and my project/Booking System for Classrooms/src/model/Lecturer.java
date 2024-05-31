package model;

public class Lecturer {
    private  int id;
    private String name;
    public Lecturer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Lecturer(){

    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name  =  "+ name+
                "\nId  =  "+id;
    }
}
