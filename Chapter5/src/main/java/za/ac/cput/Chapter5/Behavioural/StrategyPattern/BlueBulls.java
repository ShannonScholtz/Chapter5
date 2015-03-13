package za.ac.cput.Chapter5.Behavioural.StrategyPattern;

/**
 * Created by student on 2015/03/11.
 */
public class BlueBulls implements RugbyTeam{

    @Override
    public boolean teamScore(int score) {
        return score <= 25;
    }
}
