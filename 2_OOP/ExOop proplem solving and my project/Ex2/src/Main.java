import model.Player;
import service.PlayerService;
import service.ValidationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Player p1 = new Player(scanner.nextInt(), scanner.nextLine());
        if (ValidationService.check(p1))
            PlayerService.print(p1);
    }
}