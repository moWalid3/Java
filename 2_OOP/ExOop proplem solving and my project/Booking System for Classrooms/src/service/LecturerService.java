package service;

import model.Lecturer;

import javax.swing.*;
import java.util.ArrayList;

public class LecturerService {
    ArrayList<Lecturer> lecturers = new ArrayList<>();
    public  void addLecturer() {
        int test=0;
        do {
            String value= JOptionPane.showInputDialog("Enter id :");
            int id =Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Enter name :");
            if (checkId(id)==-1)
                JOptionPane.showMessageDialog(null,"this id is exists !!");
            else
                lecturers.add(new Lecturer(id,value));
            test = JOptionPane.showConfirmDialog(null,"do you want to try again add?","confirm",JOptionPane.YES_NO_OPTION);
        }while (test==0);
    }
    public  int checkId(int id){
        for (Lecturer ele:lecturers){
            if (id == ele.getID())
                return -1;
        }
        return id;
    }
    public void showLecturer(){
        int test=0;
        do {
            String value= JOptionPane.showInputDialog("Enter id :");
            int id =Integer.parseInt(value);
            int i=checkId(id);
            if (i==-1){
                for(Lecturer ele : lecturers){
                    if (ele.getID()==id){
                        JOptionPane.showMessageDialog(null,ele.toString());
                        break;
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"this id is not find !!!");
            }
            test = JOptionPane.showConfirmDialog(null,"do you want to try again add?","confirm",JOptionPane.YES_NO_OPTION);
        }while (test==0);
    }
    public void deleteLecturer(){
        int test=0;
        do {
            String value= JOptionPane.showInputDialog("Enter id :");
            int id =Integer.parseInt(value);
            int i=checkId(id);
            if (i==-1){
                for(Lecturer ele : lecturers){
                    if (ele.getID()==id){
                        lecturers.remove(ele);
                        JOptionPane.showMessageDialog(null,"delete is done .");
                        break;
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"this id is not find !!!");
            }
            test = JOptionPane.showConfirmDialog(null,"do you want to try again delete?","confirm",JOptionPane.YES_NO_OPTION);
        }while (test==0);

    }




}
