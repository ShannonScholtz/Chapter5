package za.ac.cput.Chapter5.Behavioural.VisitorPattern;

import java.util.List;

/**
 * Created by student on 2015/03/12.
 */
public interface Fights {

    public void rounds(DivisionsWon ko);
    public void rounds(KnockoutInDivision fr);
    public void rounds(List<MMAFights> fightList);
}
