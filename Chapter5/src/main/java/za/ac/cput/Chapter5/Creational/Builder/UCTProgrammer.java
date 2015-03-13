package za.ac.cput.Chapter5.Creational.Builder;

/**
 * Created by student on 2015/03/12.
 */
public class UCTProgrammer implements ProgrammerBuilder {

    private Programmer p;

    public UCTProgrammer() {
        p = new Programmer();
    }

    @Override
    public void eat()
    {
        p.setEat("Gatsby");
    }

    @Override
    public void sleep()
    {
        p.setSleep("Warm Bed");
    }

    @Override
    public void code()
    {
        p.setCode("Html");
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


