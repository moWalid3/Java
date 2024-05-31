import model.ClubPlayer;
import service.ClubService;
import service.PrivateClubServiceImpl;
import service.PublicClubServiceImpl;

public class Main {
    public static void main(String[] args) {
        ClubPlayer player=new ClubPlayer();
        player.setId(33);
        ClubService clubService=new PublicClubServiceImpl();
        System.out.println(clubService.show(player).getId());
        player.setId(55);
        clubService=new PrivateClubServiceImpl();
        System.out.println(clubService.show(player).getId());
    }
}