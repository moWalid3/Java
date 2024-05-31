import model.Player;
import model.Student;
import service.PlayerService;
import service.StudentService;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Player player=new Player();
        Student student=new Student();
        player.setNumber(s.nextInt());
        player.setName(s.next());
        player.setId(s.nextInt());
        student.setAge(s.nextInt());
        student.setName(s.next());
        student.setId(s.nextInt());
        PlayerService p=new PlayerService();
        p.print(player);
        StudentService st=new StudentService();
        st.print(student);


    }
}