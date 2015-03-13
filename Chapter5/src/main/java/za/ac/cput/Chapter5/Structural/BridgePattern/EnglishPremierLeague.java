package za.ac.cput.Chapter5.Structural.BridgePattern;

/**
 * Created by student on 2015/03/12.
 */
public class EnglishPremierLeague extends Football {

    public EnglishPremierLeague(Sports sp) {
        this.scoringOpportunities = 6;
        this.sp = sp;
    }

    @Override
    public String score() {
        return "One of the best leagues in the world"+sp.play();
    }
}
