package za.ac.cput.Chapter5.Behavioural.ChainOfResponsibiltyPattern;

/**
 * Created by student on 2015/03/11.
 */
public class ArsenalFc extends BestEnglishSoccerClubs {

    @Override
    public void Response(BestEnglishSoccerClubsEnum response) {
        if (response == BestEnglishSoccerClubsEnum.Arsenal) {
            System.out.println("Arsenal handles the pressure" + response);
            System.out.println("Arsenal plays good football");
        } else {
            System.out.println("Arsenal can't handle the pressure \n" + response);
            if (champions != null)
                champions.Response(response);
        }
    }
}
