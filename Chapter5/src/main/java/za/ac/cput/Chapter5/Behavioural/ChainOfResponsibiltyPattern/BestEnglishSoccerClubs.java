package za.ac.cput.Chapter5.Behavioural.ChainOfResponsibiltyPattern;

/**
 * Created by student on 2015/03/11.
 */
public abstract class BestEnglishSoccerClubs {

    BestEnglishSoccerClubs champions;
    public void setChampions(BestEnglishSoccerClubs champions)
    {
        this.champions = champions;
    }

    public abstract void Response(BestEnglishSoccerClubsEnum response);
}

