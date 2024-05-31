package model;

public class Employee {
    private int hours;
    private int salary;

    public Employee(int hours, int salary) {
        this.hours = hours;
        this.salary = salary;
    }
    public Employee(){}

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
