package za.ac.cput.Chapter5.Creational.Prototype;

/**
 * Created by student on 2015/03/12.
 */
public class Runner implements Prototype{

    String runs;

    public Runner(String cycles) {
        this.runs = runs;
    }

    @Override
    public Prototype action() {
        return new Runner(runs);
    }

    @Override
    public String toString() {
        return "Runs fast "+ runs;
    }
}
