package model;



public class Day {
    private String date;
    private static Appointment []appointments=new Appointment[10];

    public static void add(){
        for (int i = 1; i <= 10; i++) {
            appointments[i-1]=new Appointment(i,(8+i)+":00 - "+(9+i)+":00" );
        }
    }

    public Day(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static Appointment[] getAppointments() {
        return appointments;
    }

    public static void setAppointments(Appointment[] appointments) {
        Day.appointments = appointments;
    }
}
