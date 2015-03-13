package za.ac.cput.Chapter5.Creational.Builder;

/**
 * Created by student on 2015/03/12.
 */
public class CPUTProgammer implements  ProgrammerBuilder {

    private Programmer p;

    public CPUTProgammer() {
        p = new Programmer();
    }

    @Override
    public void eat()
    {
        p.setEat("Pizza");
    }

    @Override
    public void sleep()
    {
        p.setSleep("Comfy Bed");
    }

    @Override
    public void code()
    {
        p.setCode("Testing Code");
    }

    @Override
    public void fitness()
    {
        p.setFitness("Jogging");
    }

    @Override
    public Programmer getActivities()
    {
       return p;
    }
}
