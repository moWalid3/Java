package service;

import model.Details;
import model.Player;
import validate.ValidationService;

public class PlayerService implements CanPlayer {
    @Override
    public void print(Player player){
        if (ValidationService.checkNumbers(player))
            System.out.println(player.getNumber() + "   " + player.getName() + "  " + player.getId());
        else
            System.out.println("invalid number");
    }

}
