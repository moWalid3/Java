import model.Player;
import model.Shirt;

public class Main {
    public static void main(String[] args) {
        // relationship between 2 classes.
        Shirt sh1=new Shirt();
        sh1.setColor("red");
        Player pl1=new Player();
        pl1.setName("Abo Trika");
        sh1.setPlayer(pl1);
        pl1.setShirt(sh1);
        System.out.println(sh1.getPlayer().getName());
        System.out.println(pl1.getShirt().getColor());

    }
}