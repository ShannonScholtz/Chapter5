package za.ac.cput.Chapter5.Structural.BridgePattern;

/**
 * Created by student on 2015/03/12.
 */
public class LaLiga extends Football{

    public LaLiga(Sports sp) {
        this.scoringOpportunities = 12;
        this.sp = sp;
    }

    @Override
    public String score() {
        return "A lot of flair in the spanish league" + sp.play();
    }
}
