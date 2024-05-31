package model;

public class Data {
    private int id;
    private String name;
    public Data(int id,String name){
        this.name=name;
        this.id=id;
    }
    public Data(){

    }
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}
