package za.ac.cput.Chapter5.Structural.BridgePattern;

/**
 * Created by student on 2015/03/12.
 */
public class Spanish implements Sports{

    int goals;

    public Spanish() {
        goals = 6;
    }

    @Override
    public String play() {
        return "\nYou have to be fast and skillful";
    }
}
