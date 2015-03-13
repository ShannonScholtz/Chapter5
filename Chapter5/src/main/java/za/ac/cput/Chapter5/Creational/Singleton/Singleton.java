package za.ac.cput.Chapter5.Creational.Singleton;

/**
 * Created by student on 2015/03/12.
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public void FootballLegend() {
        System.out.println("Pele");
    }
}
