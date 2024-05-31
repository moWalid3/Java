package I_polymorphism;

public class Main {
    public static void main(String[] args) {

        // this code is call polymorphism
        User user;

        user = new Employee();
        System.out.println(user.manager());

        user = new Manager();
        System.out.println(user.manager());

        // you can do polymorphism from sub to super but use casting ==> its give me error I don't know why
        Manager obj = (Manager) new Employee();

    }
}

