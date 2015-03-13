package za.ac.cput.Chapter5.Behavioural.TemplateMethodPattern;

/**
 * Created by student on 2015/03/11.
 */
public abstract class SoccerMethod {

    public final void methods()
    {
        tackle();
        score();
        pass();
    }

    public void tackle()
    {
        System.out.println("A footballer tackles the his opponent to get the ball");
    }
    public abstract void score();
    public abstract void pass();
}
