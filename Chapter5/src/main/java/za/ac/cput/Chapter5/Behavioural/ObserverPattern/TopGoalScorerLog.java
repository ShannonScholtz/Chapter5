package za.ac.cput.Chapter5.Behavioural.ObserverPattern;

/**
 * Created by student on 2015/03/12.
 */
public interface TopGoalScorerLog {

    public void addPlayer(TopScorer tops);
    public void removePlayer(TopScorer removeTops);
    public void log();
}
