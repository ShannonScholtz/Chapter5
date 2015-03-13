package za.ac.cput.Chapter5.Structural.BridgePattern;

/**
 * Created by student on 2015/03/12.
 */
public class English implements Sports{

    int goals;

    public English() {
        goals = 2;
    }

    @Override
    public String play() {
        return "\nTough competition";
    }
}

