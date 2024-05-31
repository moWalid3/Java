import model.Employee;
import service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(8, 200);
        EmployeeService employeeService=new EmployeeService(employee);
        employeeService.addSalary();
        employeeService.addWork();
        System.out.println(employeeService.getEmployee().getSalary());
    }
}