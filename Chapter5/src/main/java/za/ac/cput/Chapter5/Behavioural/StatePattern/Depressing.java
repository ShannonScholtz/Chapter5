package za.ac.cput.Chapter5.Behavioural.StatePattern;

/**
 * Created by student on 2015/03/11.
 */
public class Depressing implements  ChampionsLeagueFinal{

    @Override
    public String WinningTeam()
    {
        return "We won but they don't want to give through us a party";
    }

    @Override
    public String LoosingTeam()
    {
        return "We lost agh!!!!";
    }
}
