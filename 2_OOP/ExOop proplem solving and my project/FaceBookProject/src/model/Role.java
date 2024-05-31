package model;

import enums.Roles;

public class Role  extends BaseEntity{
    private User user;
    private Roles name;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getName() {
        return name;
    }

    public void setName(Roles name) {
        this.name = name;
    }
}
