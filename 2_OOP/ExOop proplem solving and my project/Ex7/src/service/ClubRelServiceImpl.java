package service;


import model.ClubRel;

public class ClubRelServiceImpl extends ClubService implements ClubRelService {
    @Override
    public void print(ClubRel clubRel) {
        System.out.println(clubRel.getId()+" . "+clubRel.getNumber()+" . "+clubRel.getName()+" . "+clubRel.getRCode());
    }
}
