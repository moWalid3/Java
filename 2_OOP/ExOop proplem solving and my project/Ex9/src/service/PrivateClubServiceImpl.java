package service;

import model.ClubPlayer;

public final class PrivateClubServiceImpl implements ClubService {

    @Override
    public ClubPlayer show(ClubPlayer clubPlayer) {
        System.out.println("Private Club pro");
        return clubPlayer;
    }
}
