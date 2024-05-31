package Test;

public class Customer {
    public Customer(String name, int id) {
        this.id = id;
        this.name = name;
        // If anyone needs anything in "Math (All Branches)", don't hesitate to ask.
    }

    public Customer() {}

    private String name = "Unknown";
    private int id = -1;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
