package za.ac.cput.Chapter5.Behavioural.TemplateMethodPattern;

/**
 * Created by student on 2015/03/11.
 */
public class Midfielder extends SoccerMethod{

    @Override
    public void score()
    {
       System.out.println("A Midfielder scores like a boss");
    }

    @Override
    public void pass()
    {
        System.out.println("A Midfielder creates chance by changing play");
    }
}
