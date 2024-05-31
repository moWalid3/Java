import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {
        Club club=new Club();
        club.setId(1);
        club.setName("c1");
        club.setNumber(55);
        ClubService.print(club);

        ClubFc clubFc=new ClubFc();
        clubFc.setId(2);
        clubFc.setName("fc");
        clubFc.setNumber(44);
        clubFc.setFCode("st33");
        ClubService.print(clubFc);
        ClubFcService fc=new ClubFcServiceImpl();
        fc.print(clubFc);

        ClubRel clubRel=new ClubRel();
        clubRel.setId(3);
        clubRel.setName("rel");
        clubRel.setNumber(33);
        clubRel.setRCode("nt77");
        ClubService.print(clubRel);
        ClubRelService rel=new ClubRelServiceImpl();
        rel.print(clubRel);


    }
}