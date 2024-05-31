package model;

public class Player {
    private int number;
    private String name;
    public Player(int number,String name){
        this.name=name;
        this.number=number;
    }
    Player(){}
    public int getNumber(){
        return number;
    }

    public String getName() {
        return name;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public void setName(String name){
        this.name=name;
    }
}
