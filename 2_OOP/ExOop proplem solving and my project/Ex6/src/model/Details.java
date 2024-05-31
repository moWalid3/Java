package model;

public class Details {
    private int id;
    private String name;

    public Details(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Details() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
