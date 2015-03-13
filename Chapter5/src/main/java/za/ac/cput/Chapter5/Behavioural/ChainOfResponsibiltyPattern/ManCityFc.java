package za.ac.cput.Chapter5.Behavioural.ChainOfResponsibiltyPattern;

/**
 * Created by student on 2015/03/11.
 */
public class ManCityFc extends BestEnglishSoccerClubs {

    @Override
    public void Response(BestEnglishSoccerClubsEnum response) {
        if (response == BestEnglishSoccerClubsEnum.ManCity) {
            System.out.println("Man City handles the pressure" + response);
            System.out.println("Man City's owner is rich");
        } else {
            System.out.println("Man City can't handle the pressure \n" + response);
            if (champions != null)
                champions.Response(response);
        }
    }
}
