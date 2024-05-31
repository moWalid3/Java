package service;

import model.Player;

public class ValidationService {
    public static boolean check(Player player){
        if (player.getNumber() <= 0) {
            System.out.println("invalid number");
            return false;
        }
        else if(player.getName().length() <10){
            System.out.println("invalid name");
            return false;
        }
        return true;
    }
}
