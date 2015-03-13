package za.ac.cput.Chapter5.Behavioural.StrategyPattern;

/**
 * Created by student on 2015/03/11.
 */
public class Result {

    int score;
    RugbyTeam rugbyteam;

    public Result(int score,  RugbyTeam rugbyteam) {
        this.score = score;
        this.rugbyteam = rugbyteam;
    }

    public void setRugbyTeam(RugbyTeam rugbyteam) {
        this.rugbyteam = rugbyteam;
    }

    public int getScore() {
        return score;
    }

    public boolean getResult() {
        return rugbyteam.teamScore(score);
    }
}
