package za.ac.cput.Chapter5.Structural.BridgePattern;

/**
 * Created by student on 2015/03/12.
 */
public abstract class Football {

    Sports sp;
    int scoringOpportunities;

    public abstract String score();

    public void setSport(Sports sp) {
        this.sp =  sp;
    }

    public String AverageScoringStats(int goals) {
        int stats = scoringOpportunities / goals;
        if(stats < 3)
            return "The player is scoring a average of about 1 goal per game ";
        else
            return "The player is scoring a average of about 2 goal per game ";
    }
}
