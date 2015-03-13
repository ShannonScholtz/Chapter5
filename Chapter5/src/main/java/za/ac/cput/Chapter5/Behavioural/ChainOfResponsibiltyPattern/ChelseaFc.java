package za.ac.cput.Chapter5.Behavioural.ChainOfResponsibiltyPattern;

/**
 * Created by student on 2015/03/11.
 */
public class ChelseaFc extends BestEnglishSoccerClubs {

    @Override
    public void Response(BestEnglishSoccerClubsEnum response) {
        if (response == BestEnglishSoccerClubsEnum.Chelsea) {
            System.out.println("Chelsea handles the pressure" + response);
            System.out.println("Chelsea plays good football");
        } else {
            System.out.println("Chelsea can't handle the pressure \n" + response);
            if (champions != null)
                champions.Response(response);
        }
    }
}
