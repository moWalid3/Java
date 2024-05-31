import model.*;

public class Main {
    public static void main(String[] args) {

        // **********************************************************

        Food food1 = new Food();
        food1.setName("pasta");

        

        Food food2 = new Food();
        food2.setName("rice");

        Food food3 = new Food();
        food3.setName("potato");

        Food food4 = new Food();
        food4.setName("fish");

        Food food5 = new Food();
        food5.setName("salad");

        // **********************************************************
        Order order1 = new Order();
        order1.setName("order 1");

        order1.getFoods().add(food1);
        order1.getFoods().add(food2);
        order1.getFoods().add(food4);

        Order order2 = new Order();
        order2.setName("order 2");

        order2.getFoods().add(food5);
        order2.getFoods().add(food3);
        order2.getFoods().add(food4);

        Order order3 = new Order();
        order3.setName("order 3");

        order3.getFoods().add(food1);
        order3.getFoods().add(food2);
        order3.getFoods().add(food3);
        order2.getFoods().add(food4);
        order2.getFoods().add(food5);


        // **********************************************************
        Bill bill1 = new Bill();
        bill1.setName("bill1");

        Bill bill2 = new Bill();
        bill2.setName("bill2");

        Bill bill3 = new Bill();
        bill3.setName("bill3");

        // **********************************************************
        Gift gift1 = new Gift();
        gift1.setName("gift1");

        Person person1 = null;
        gift1.setPerson(person1);

        Gift gift2 = new Gift();
        gift2.setName("gift2");

        // **********************************************************
        person1 = new Person();
        person1.setName("mohamed walid");

        person1.getOrders().add(order1);
        person1.setGift(gift1);

        Person person2 = new Person();
        person2.setName("Ahmed ali");


    }
}