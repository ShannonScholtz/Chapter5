package za.ac.cput.Chapter5.Behavioural.StrategyPattern;

/**
 * Created by student on 2015/03/11.
 */
public class Stormers implements RugbyTeam{

    @Override
    public boolean teamScore(int score) {
        return score >= 30 && score <= 90;
    }
}
