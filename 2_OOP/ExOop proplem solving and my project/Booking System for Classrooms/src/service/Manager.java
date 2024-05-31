package service;

import model.Lecturer;

import javax.swing.*;

public class Manager {
    public static void main(String[] args) {
        while (true) mainMenu();
    }
    public static void mainMenu(){
        String main="""
                *** the main menu ***
                1) lecture menu
                2) appointment menu
                3) report menu
                4) exit.
                """;
        String value=JOptionPane.showInputDialog(main);
        int num = Integer.parseInt(value);
        switch (num){
            case 1 ->{
                lectureMenu();
            }
            case 2 ->{
                appointMenu();
            }
            case 3 ->{
                reportMenu();
            }
            case 4 ->{
                System.exit(0);
            }
            default -> JOptionPane.showMessageDialog(null,"invalid number.!!");
        }

    }
    static LecturerService lecturerService =new LecturerService();
    public static void lectureMenu() {
        boolean isReturn = true;
        while (isReturn) {
            String menu = """
                     *** lecturer menu ***
                    1) add new lecturer
                    2) delete lecturer
                    3) show lecturer
                    4) return to main menu
                    """;
            String value = JOptionPane.showInputDialog(menu);
            int num = Integer.parseInt(value);

            switch (num) {
                case 1 -> {
                    lecturerService.addLecturer();
                }
                case 2 -> {
                    lecturerService.deleteLecturer();
                }
                case 3 -> {
                    lecturerService.showLecturer();
                }
                case 4 -> {
                    isReturn=false;
                }
                default -> JOptionPane.showMessageDialog(null, "invalid number.!!");
            }
        }
    }

    public static void appointMenu(){
        int test=0;
        do {
            String value= JOptionPane.showInputDialog("Enter id :");
            int id =Integer.parseInt(value);
            int i=lecturerService.checkId(id);
            if (i == -1) {
                for (Lecturer ele :
                        lecturerService.lecturers) {
                    if (ele.getID() == id) {
                        JOptionPane.showMessageDialog(null,ele.toString());
                        break;
                    }
                }
                break;
            } else {
                JOptionPane.showMessageDialog(null, "this id is exists !!");
                test = JOptionPane.showConfirmDialog(null,"do you want to try again Log ?","confirm",JOptionPane.YES_NO_OPTION);
            }
        }while (test==0);

        boolean isReturn=true;
        while (isReturn) {
            String menu = """
                     *** modification menu ***
                     --> what you want to modify ?
                     1) add new appointment.
                     2) delete appointment.
                     3) postpone appointment.
                     4) change appointment status.
                     5) return to main menu.
                    """;
            String value = JOptionPane.showInputDialog(menu);
            int num =Integer.parseInt(value);

            switch (num) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {
                    isReturn = false;
                }
                default -> JOptionPane.showMessageDialog(null,"invalid number.!!");
            }
        }
    }
    public static void reportMenu(){
        boolean isReturn = true;
        while (isReturn) {
            String menu = """
                     *** report menu ***
                     1) display all appointments for a specified day.
                     2) display appointments for a lecture.
                     3) return to main menu.
                    """;
            String value = JOptionPane.showInputDialog(menu);
            int num =Integer.parseInt(value);

            switch (num) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {
                    isReturn = false;
                }
                default -> JOptionPane.showMessageDialog(null,"invalid number.!!");
            }
        }
    }

}
