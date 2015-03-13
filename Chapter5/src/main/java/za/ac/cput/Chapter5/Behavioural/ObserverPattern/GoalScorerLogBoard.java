package za.ac.cput.Chapter5.Behavioural.ObserverPattern;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by student on 2015/03/12.
 */
public class GoalScorerLogBoard implements TopGoalScorerLog{

    Set<TopScorer> ts;
    int goals;

    public GoalScorerLogBoard(int goals) {
        ts = new HashSet();
        this.goals = goals;
    }

    @Override
    public void addPlayer(TopScorer tops) {
        ts.add(tops);
    }

    @Override
    public void removePlayer(TopScorer removeTops) {
        ts.remove(removeTops);
    }

    @Override
    public void log() {
        Iterator<TopScorer> it = ts.iterator();
        while(it.hasNext()) {
            TopScorer ts = it.next();
            ts.UpdateLog(goals);
        }
    }

    public void setGoals(int Newgoals) {
        System.out.println("Top number of goals is: "+ Newgoals);
        goals = Newgoals;
        log();
    }
}
