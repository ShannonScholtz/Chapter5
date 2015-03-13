package za.ac.cput.Chapter5.Behavioural.ChainOfResponsibiltyPattern;

/**
 * Created by student on 2015/03/11.
 */
public class ManUnited extends BestEnglishSoccerClubs {

    @Override
    public void Response(BestEnglishSoccerClubsEnum response) {
        if(response == BestEnglishSoccerClubsEnum.ManchesterUnited) {
            System.out.println("Manchester United handles the pressure "+ response);
            System.out.println("Manchester United is the best team ever");
        }
        else {
            System.out.println("Manchester can't handle the pressure \n"+ response);
            if(champions != null)
                champions.Response(response);
        }

    }

}
