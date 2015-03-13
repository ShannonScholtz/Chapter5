package za.ac.cput.Chapter5.Creational.Prototype;

/**
 * Created by student on 2015/03/12.
 */
public class Cyclist implements Prototype {

    String cycles;

    public Cyclist(String cycles) {
        this.cycles = cycles;
    }

    @Override
    public Prototype action() {
        return new Cyclist(cycles);
    }

    @Override
    public String toString() {
        return "Cycles fast "+ cycles;
    }
}
