package service;

import model.Club;

public class ClubService {
    public static void print(Club club) {
        System.out.println(club.getId()+" . "+club.getNumber()+" . "+club.getName());
    }
}
