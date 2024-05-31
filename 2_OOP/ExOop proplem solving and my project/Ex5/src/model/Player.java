package model;

public class Player extends DataWithPhone {
    private int number;

    public Player(int id, String name, String phone, int number) {
        super(id, name, phone);
        this.number = number;
    }
    public Player(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
