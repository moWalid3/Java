package model;

public class Appointment {
    private int serialNumber;
    private String status;
    private Lecturer lecturer;
    private boolean isAvailable;
    private String time;

    public Appointment(int serialNumber, String time) {
        this.serialNumber=serialNumber;
        this.time=time;
        this.isAvailable=true;
        this.status="pending";
    }
    public Appointment(){}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
