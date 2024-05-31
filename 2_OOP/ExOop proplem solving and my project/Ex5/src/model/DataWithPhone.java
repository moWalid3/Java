package model;



public class DataWithPhone extends Data {
    private String phone;
    public DataWithPhone(){

    }

    public DataWithPhone(int id, String name, String phone) {
        super(id,name);
        this.phone=phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
