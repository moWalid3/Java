package service;

import model.Player;

public class PlayerService {
    public static void print(Player player){
        System.out.println(player.getName()+"  "+player.getNumber());
    }
}
