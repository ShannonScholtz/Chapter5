package za.ac.cput.Chapter5.Behavioural.ObserverPattern;

/**
 * Created by student on 2015/03/12.
 */
public class ChelseaPlayer implements TopScorer {

    public void UpdateLog(int goals)
    {
        System.out.println("Diego Costa is top goal scorer with: " + goals);
    }
}
