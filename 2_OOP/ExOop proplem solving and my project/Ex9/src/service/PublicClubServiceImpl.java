package service;

import model.ClubPlayer;

public final class PublicClubServiceImpl implements ClubService{
    @Override
    public ClubPlayer show(ClubPlayer clubPlayer) {
        System.out.println("Public Club pro");
        return clubPlayer;
    }
}
