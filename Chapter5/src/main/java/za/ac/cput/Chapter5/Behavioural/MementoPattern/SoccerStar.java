package za.ac.cput.Chapter5.Behavioural.MementoPattern;

/**
 * Created by student on 2015/03/11.
 */
public class SoccerStar {
    Object ObjMemento;

    public void SaveInfo(SoccerStarDescription soccerstardescription) {
        ObjMemento = soccerstardescription.save();
    }

    public void ReinstateInfo(SoccerStarDescription soccerstardescription) {
        soccerstardescription.reinstate(ObjMemento);
    }
}

