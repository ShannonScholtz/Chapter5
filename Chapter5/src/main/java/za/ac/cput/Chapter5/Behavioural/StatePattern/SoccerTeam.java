package za.ac.cput.Chapter5.Behavioural.StatePattern;

/**
 * Created by student on 2015/03/11.
 */
public class SoccerTeam implements ChampionsLeagueFinal{

    ChampionsLeagueFinal champs;

    public SoccerTeam(ChampionsLeagueFinal champs) {
        this.champs = champs;
    }

    public void setChamps(ChampionsLeagueFinal champs) {
        this.champs = champs;
    }

    @Override
    public String WinningTeam() {
        return champs.WinningTeam();
    }

    @Override
    public String LoosingTeam() {
        return champs.LoosingTeam();
    }
}
