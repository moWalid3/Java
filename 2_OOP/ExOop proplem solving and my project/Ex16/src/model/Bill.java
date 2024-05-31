package model;

import java.util.ArrayList;
import java.util.List;

public class Bill extends BaseEntity {
    private Person person;
    private List<Order> orders = new ArrayList<>();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
