package Service;

import model.Student;
import model.Teacher;

import java.io.*;
import java.util.ArrayList;

public class FileService {
    public void end(){
        File file1=new File("studentList.txt");
        File file2=new File("teacherList.txt");
        try{
            ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream(file1));
            ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream(file2));
            oos1.writeObject(StudentService.studentList);
            oos2.writeObject(TeacherService.teacherList);
            oos1.flush();
            oos2.flush();
            oos1.close();
            oos2.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void start(){
        File file1=new File("studentList.txt");
        File file2=new File("teacherList.txt");
        try{
            if (file1.createNewFile()&&file2.createNewFile()) {
                System.out.println();
            }
            ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(file1));
            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(file2));

            StudentService.studentList = (ArrayList<Student>) ois1.readObject();
            TeacherService.teacherList = (ArrayList<Teacher>) ois2.readObject();

            ois1.close();
            ois2.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
