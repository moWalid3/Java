package service;


import model.ClubFc;


public class ClubFcServiceImpl extends ClubService implements ClubFcService {
    @Override
    public void print(ClubFc clubFc) {
        System.out.println(clubFc.getId()+" . "+clubFc.getNumber()+" . "+clubFc.getName()+" . "+clubFc.getFCode());
    }
}
