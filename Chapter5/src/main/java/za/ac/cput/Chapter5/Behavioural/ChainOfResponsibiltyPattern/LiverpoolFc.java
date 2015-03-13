package za.ac.cput.Chapter5.Behavioural.ChainOfResponsibiltyPattern;

/**
 * Created by student on 2015/03/11.
 */
public class LiverpoolFc extends BestEnglishSoccerClubs {

    @Override
    public void Response(BestEnglishSoccerClubsEnum response) {
        if (response == BestEnglishSoccerClubsEnum.Liverpool) {
            System.out.println("Liverpool handles the pressure" + response);
            System.out.println("Liverpool football is poor");
        } else {
            System.out.println("Liverpool can't handle the pressure as always \n" + response);
            if (champions != null)
                champions.Response(response);
        }
    }
}
