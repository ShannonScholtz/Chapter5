package za.ac.cput.Chapter5.Structural.Composite;

/**
 * Created by student on 2015/03/12.
 */
public class Footballer implements SoccersBest{

    String player;

    public Footballer(String name) {
        this.player = name;
    }
    @Override
    public void scores() {
        System.out.println(player + "Scores the greatest goal ever");
    }

    @Override
    public void saves() {
        System.out.println(player + " Saves and amazing shot at goal");
    }
}
