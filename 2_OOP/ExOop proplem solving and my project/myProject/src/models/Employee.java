package models;

public class Employee extends Person {
    private String department;

    public Employee(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }
    @Override
    public String getDescription() {
        return  "He is working in : "+department+" department";
    }

}
