package za.ac.cput.Chapter5.Creational.Builder;

/**
 * Created by student on 2015/03/12.
 */
public class ProgrammerDirector {

    private ProgrammerBuilder programmerbuilder;

    public ProgrammerDirector(ProgrammerBuilder programmerbuilder) {
        this.programmerbuilder = programmerbuilder;
    }

    public void ProgramLife() {
        programmerbuilder.eat();
        programmerbuilder.sleep();
        programmerbuilder.code();
        programmerbuilder.fitness();
    }

    public Programmer getActivities() {
        return programmerbuilder.getActivities();
    }

}
