package model;

public abstract class Details {
    private int id;
    private String name;
    Details (){}

    public Details(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static boolean checkId(Details details){

        return false;
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
