package I_polymorphism;

public abstract class User {
    abstract String manager();
}
class Employee extends User {
    @Override
    String manager() {
        return "this is employee";
    }
}
class Manager extends Employee {
    @Override
    String manager() {
        return "this is manager";
    }
}
