import model.Person;
import model.Player;
import model.Student;
import service.AllService;

public class Main {
    public static void main(String[] args) {

        Player player = new Player(1, "Abo treka", "010222", 22);
        Student student=new Student(2,"mohamed","011132",19);
        Person person=new Person(3,"ali");
        AllService.print(player);
        AllService.print(student);
        AllService.print(person);

    }
}