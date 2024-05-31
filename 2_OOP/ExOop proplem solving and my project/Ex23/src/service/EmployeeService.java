package service;

import model.Employee;

public class EmployeeService {
    private Employee employee;

    public EmployeeService(Employee employee) {
        this.employee=employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void addSalary(){
        if (this.employee.getSalary() < 500) {
            this.employee.setSalary(this.employee.getSalary()+10);
        }
    }
    public void addWork(){
        if (this.employee.getHours() > 6) {
            this.employee.setSalary(this.employee.getSalary()+5);
        }
    }
}
