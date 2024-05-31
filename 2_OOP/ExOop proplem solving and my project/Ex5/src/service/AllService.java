package service;

import model.Person;
import model.Player;
import model.Student;

public class AllService {
    public static void print(Person person){
        System.out.println(person.getId()+" . "+person.getName());
    }
    public static void print(Student student){
        System.out.println(student.getId()+" . "+student.getName()+" . "+student.getPhone()+"  . "+student.getAge());
    }
    public static void print(Player player){
        System.out.println(player.getId()+" . "+player.getName()+" . "+player.getPhone()+"  . "+player.getNumber());
    }
}
