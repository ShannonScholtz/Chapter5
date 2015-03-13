package za.ac.cput.Chapter5.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/12.
 */
public class Composite implements SoccersBest{

    List<SoccersBest> soccersbest;

    public Composite(){
        soccersbest = new ArrayList();
    }

    @Override
    public void scores() {
        for(SoccersBest sb : soccersbest)
            sb.scores();
    }

    @Override
    public void saves() {
        for(SoccersBest sb : soccersbest)
            sb.saves();
    }

    public void add(SoccersBest sb) {
        soccersbest.add(sb);
    }

    public void remove(SoccersBest sb) {
        soccersbest.remove(sb);
    }

    public List<SoccersBest> getSoccersBest() {
        return soccersbest;
    }

    public SoccersBest getIndex(int index) {
        return soccersbest.get(index);
    }
}
