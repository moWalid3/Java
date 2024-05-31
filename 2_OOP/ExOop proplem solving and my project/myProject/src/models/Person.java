package models;

import java.io.Serializable;

public class Person implements Serializable {
    protected String name;
    protected String email;
    protected String description;

    public Person(String name, String email) {
        this.name=name;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getDescription() {
        return description;
    }


}
