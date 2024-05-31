package validate;

import model.Player;
import model.Student;

public class ValidationService {
    public static boolean checkNumbers(Player player){
        return player.getNumber() > 0 && player.getNumber() <= 99;
    }
    public static boolean checkAge(Student student) {
        return student.getAge() > 5 && student.getAge() < 30;
    }
}
